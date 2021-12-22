<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login Here</h1>
	<form method="post" action="Login.do">
		<input type="hidden" name="formid" value="login">
		
		<div>UserName:<input type="text" name="uname"></div>
		<h1> </h1>
		<div>Password:<input type="password" name="upass"></div>
		<h1> </h1>
		<input type="submit" value="Login..">
	
	</form>
</body>
</html>