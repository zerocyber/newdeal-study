<%@page import="com.demoweb.model.dao.BoardDao"%>
<%@page import="com.demoweb.model.dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<%
	//목록 페이지에서 선택한 글의 번호를 읽어서 변수에 저장
	Integer boardNo = null;
	try {
		boardNo = Integer.valueOf(request.getParameter("boardno"));
	} catch (Exception ex) {
	}
	//글번호가 없다면
	if (boardNo == null) {
		//목록으로 이동
		response.sendRedirect("boardlist.jsp");
		return;
	}
	BoardDao dao = new BoardDao();
	Board board = dao.getBoardByBoardNo(boardNo);

	if (board == null) {//조회된 글이 없다면
		//목록으로 이동
		response.sendRedirect("boardlist.jsp");
		return;
	}

	dao.increaseReadCount(boardNo);

	String pageNo = "1";
	if (request.getParameter("pageno") != null) {
		pageNo = request.getParameter("pageno");
	}
%>

<!DOCTYPE html>

<%@page import="com.demoweb.model.dto.Member"%>
<html>
<head>
<meta charset="UTF-8" />
<title>글쓰기</title>
<link rel="Stylesheet" href="/demoweb/styles/default.css" />
<link rel="Stylesheet" href="/demoweb/styles/input2.css" />

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>

<script type="text/javascript">
	function deleteBoard(number, pageno) {
		//confirm : 예/아니오 버튼의 선택에 따라 true/false 반환
		if (confirm(number + "번 글을 삭제할까요?")) {
			//location.href=path -> 지정된 경로로 이동
			location.href = 'boarddelete.jsp?boardno=' + number + "&pageno="
					+ pageno;
		}
	}

	$(document).ready(function() {
		function getCommetList(){
			var boardno = '${param.boardno}';
			var str = "";	
			
			$.ajax({
				data: {boardno : boardno},
				url : "getCommentList.jsp",
				success : function(data){
					console.log(data);
			    	str += "<div data-rno='"+this.commentNo+"' data-content='"+ this.content
			    	+"'data-writer='"+this.writer+"'>"
			    	+"</div>" 
			    	+"<div>"+this.writer
			    	+"<div>"+ this.content +"<div>"
			    	+"<span>"+ cal +"<span>"
				    +"<button class='btn btn-info btn-xs' id='reModiBtn'>수정</button>"
				    +"<button class='btn btn-danger btn-xs' id='redeleteBtn'>삭제</button></div>";
				}			
			});
			$(".replyBox").html(str);
		}
		
	getCommentList();

		
		$(".replyBox").on("click", "div #reModiBtn",function(){
			console.log("수정버튼 클릭");
			console.log(this);
		});
		
		
		var user = "${loginuser.memberId}";
		if (user != "") {
			$(".replyWriter").val(user);
		}

		$("#replyBtn").on("click", function(e) {			
			if(user == ""){
				alert("로그인 해주세요");
				return;
			}	
			var content = $(".replyContent").val();
			var writer = $(".replyWriter").val();
			var boardno = '${param.boardno}';
			$.ajax({
				type : "post",
				url : "insertComment.jsp",
				dataType : "text",
				data : {
					content : content,
					writer : writer,
					boardno : boardno
				},
				success : function(result) {
					$(".replyContent").val("");
					getCommentList();
				}
			});

		});

	});
</script>

</head>

<body>
	<div id="pageContainer">
		<%
			pageContext.include("/include/header.jsp");
		%>
		<div style="padding-top: 25px; text-align: center">
			<div id="inputcontent">
				<div id="inputmain">
					<div class="inputsubtitle">게시판 글 쓰기</div>
					<table>
						<tr>
							<th>제목</th>
							<td><%=board.getTitle()%></td>
						</tr>
						<tr>
							<th>작성자</th>
							<td><%=board.getWriter()%></td>
						</tr>
						<tr>
							<th>작성일</th>
							<td><%=board.getRegDate()%></td>
						</tr>
						<tr>
							<th>조회수</th>
							<td><%=board.getReadCount() + 1%></td>
						</tr>
						<tr>
							<th>내용</th>
							<td style="height: 200px; vertical-align: top"><%=board.getContent().replaceAll("\r\n", "<br />")%></td>
						</tr>
					</table>


					<div class="row">
						<div class="col-sm-9 col-sm-offset-1">
							<label for="replyList" class="replyUL">ReplyList</label>
						</div>
						<div class="col-sm-9 col-sm-offset-1 replyBox">
						
						
						</div>
					</div>

					<div class="row">
						<div class="col-sm-9 col-sm-offset-1">
							<div class="empty col-sm-12 text-center"></div>
						</div>
					</div>

					<div class="row">
						<div class="col-sm-9 col-sm-offset-1">
							<label for="replyContent"></label>
							<div class="row">
								<textarea class="form-control replyContent" rows="2"></textarea>
								<label class="col-sm-1">Writer</label><input tyep="text"
									class="col-sm-2 replyWriter" readonly="readonly" />
								<button type="submit"
									class="col-sm-1 col-sm-offset-8 btn btn-default btn-xs active"
									id="replyBtn">등록</button>
							</div>
						</div>
					</div>


					<div class="buttons">


						<%
							if (session.getAttribute("loginuser") != null) {
						%>
						<%
							Member member = (Member) session.getAttribute("loginuser");
						%>
						<%
							if (member.getMemberId().equals(board.getWriter())) {
						%>
						<a
							href="boardeditform.jsp?boardno=<%=board.getBoardNo()%>&pageno=<%=pageNo%>">편집</a>
						<a
							href="javascript:deleteBoard(<%=board.getBoardNo()%>,<%=pageNo%>);">삭제</a>
						<%
							}
						%>
						<a
							href="boardreplyform.jsp?boardno=<%=board.getBoardNo()%>&pageno=<%=pageNo%>">답글쓰기</a>
						<%
							}
						%>
						<a href="boardlist.jsp?pageno=<%=pageNo%>">목록보기</a>
					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>