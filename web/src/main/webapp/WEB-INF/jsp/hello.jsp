<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	${name}
	
<script>
$(function() {
	$.ajax({
		  method: "POST",
		  url: "/api/test",
		  contentType: "application/json",
		  dataType: "json",
		  data: JSON.stringify({ name: "John", location: "Boston" })
			})
		  .done(function( msg ) {
		    alert( "Data Saved: " + msg );
		  });
});
</script>
</body>
</html>