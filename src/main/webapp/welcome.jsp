<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>
<%@ include file="logout.jsp" %>
	<h1> </h1>
	<form method="get" action="shopping.do">
		<input type="hidden" name="formid" value="goshopping">
		<input type="submit" value="Go Shopping..">
	</form>
</body>
</html>