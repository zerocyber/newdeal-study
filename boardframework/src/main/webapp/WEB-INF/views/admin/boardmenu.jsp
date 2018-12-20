<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/public.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.menu_list {
	width: 200px;
}

.menu_category {
	padding: 5px 10px;
	cursor: pointer;
	position: relative;
	font-weight: bold;
	background-color: darkgray;
	color: lightgray;
}

.menu_body {
	display: none;
	text-align: left;
}

.menu_body a {
	display: block;
	background: lightgray;
	padding: 10px;
	text-decoration: none;
}

.menu_body a:hover {
	color: steelblue;
	text-decoration: underline;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	$("#boardMenu p.menu_category").click(function() {
		$(this).next("div.menu_body").
		slideDown(500).siblings("div.menu_body").
		slideUp("fast");
	});
});
</script>
</head>
<body>
	<h1>BoardMenu Page</h1>

	<div id="boardMenu" class="menu_list" align="center">
		<c:set var="idx" value="0" />
		<c:forEach varStatus="i" var="board" items="${menu}">
			<c:if test="${board.ccode != idx}">
				<p class="menu_category">${board.cname}</p>
				<c:set var="idx" value="${board.ccode}" />
				<div class="menu_body">
			</c:if>
		<a href="${root}/${board.control}/write.bit?bcode=${board.bcode}&pg=1&key=&word=">${board.bname}</a> 
		<c:if test="${i.index < menu.size() -1}">
			<c:if test="${idx != menu.get(i.index + 1).ccode}">	
				</div>
			</c:if>
		</c:if>
		</c:forEach>
	</div>
</body>
</html>