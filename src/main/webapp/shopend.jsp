<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop3</title>
</head>
<body>
<%@ include file="logout.jsp" %>
<h1>Generate Invoice?</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shopend">
		<input type="submit" value="Generate..">
	</form>
</body>
</html>