<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring Boot</title>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/resources/js/pageload.js"></script>
</head>
<body>
	<h1>LIST</h1>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>email</th>
				<th>password</th>
				<th>-</th>						
			</tr>
		</thead>
		<tbody id="div1">
			<c:forEach var="data" items="${list}">
				<tr>
					<td>${data.id }</td>
					<td><a href="./mod/${data.id }">${data.email }</a></td>
					<td>${data.password }</td>					
					<td><a href="./del/${data.id }">삭제</a></td>
				</tr>
			</c:forEach>			
		</tbody>
	</table>
	<a href="./add">입력</a>
	<button id="btn">load test</button>
	
<script>
$(function() {
	$('#btn').on("click", function() {
		$("#div1").load("./add");
	});
});

</script>
</body>
</html>