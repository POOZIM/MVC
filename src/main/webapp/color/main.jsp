<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
/*if (color == null){
	color = "";
}
 String msg = null;
out.print("유저가 전송한 색상은 " + color);

switch (color) {
	case "red" :
		msg = "하나미 사키";
		break;
	case "blue" :
		msg = "츠키무라 테마리";
		break;
	case "green" :
		msg = "시운 스미카";
		break;
	case "yellow" :
		msg = "후지타 코토네";
		break;
	default :
		msg = "지원하지않는 아이돌입니다.";
*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">

function getResult() {
	$("#form1").attr({
		action:"/color",
		method:"POST"
	});
	
	$("#form1").submit();
}
$(function(){
		$("#bt").click(()=>{
			getResult();
		});
	});
	
</script>
</head>
<body>
	<div class="container">
		<form id="form1">
			<div class="form-group">
				<select class="form-control" name="color">
					<option>select color</option>
					<option value="red">red</option>
					<option value="blue">blue</option>
					<option value="green">green</option>
					<option value="yellow">yellow</option>
				</select>
			</div>
			<button class="btn btn-info" id="bt">결과 보기</button>
		</form>
		<h3>
			선택 결과: <br>
			<%=request.getAttribute("msg")%>
		</h3>
	</div>
</body>
</html>