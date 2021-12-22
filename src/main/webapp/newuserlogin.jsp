<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Login.do">
		<h1>Registration Successful....Please Login</h1>
		
		<input type="hidden" name="formid" value="login">
		
		UserName:<input type="text" name="uname">
		Password:<input type="password" name="upass">
		
		<input type="submit" value="Login..">
	
	</form>
</body>
</html>