<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1>Registration Page</h1>
	
	<form method="post" action="register.do">
		<input type="hidden" name="formid" value="register">
		
		<div>Username:<input type="text" name="uname"></div>
		<h1> </h1>
		<div>Password:<input type="password" name="upass"></div>
		<h1> </h1>
		<div>Name:<input type="text" name="name"></div>
		<h1> </h1>
		<div>Mobile:<input type="text" name="mobile"></div>
		<h1> </h1>
		<div>Email:<input type="text" name="email"></div>
		<h1> </h1>
		<div>City:<input type="text" name="city"></div>
		<h1> </h1>
		<div>Address:<input type="text" name="address"></div>
		<h1> </h1>
		
		<input type="submit" value="Register..">
	
	</form>
</body>
</html>