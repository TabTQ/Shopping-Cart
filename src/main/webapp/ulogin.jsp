<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Incorrect username or password</h1>
	<h1> </h1>
	<form method="post" action="Login.do">
		<input type="hidden" name="formid" value="login">
		
		<div>UserName:<input type="text" name="uname"></div>
		<div>Password:<input type="password" name="upass"></div>
		
		<input type="submit" value="Login..">
	
	</form>
</body>
</html>