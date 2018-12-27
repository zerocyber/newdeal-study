<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/public.jsp"%>
<script type="text/javascript">
$(document).ready(function() {

	var pattern = /[{}~!@#$%^&*()_+=<>?/\/]/; /* 금지어 */
	
	$("#checkId").click(function() {
		var memberId = $("#memberId").val();
		if (pattern.test(memberId) == true) {
			console.log("특수문자 사용");
			alert("아이디에 특수문자는 사용할 수 없습니다.");
			return false;
		}
		console.log(memberId);
		
		$.ajax({
			type : 'POST',
			url : "${root}/reboard/idCheck",
			dataType : "json",
			contentType: 'application/json;charset:UTF-8',
			data : memberId,
			success : function(data) {
 				if (data === 1) {
					alert("이미 존재하는 아이디입니다.");
				}
				if(data === 0){
					alert("사용 가능한 아이디입니다.")
				}
			}
		});
		
	});

});
</script>

<input id="memberId" name="memberId" value="아이디 입력">
<button id="checkId" type="button">아이디 체크</button>

</body>
</html>