<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop2</title>
</head>
<body bgcolor="orange">
<h1>Fruit Shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop2">
		
		<div>Mango:<input type="checkbox" value="mango" name="6"></div>
		<h1> </h1>
		<div>Banana:<input type="checkbox" value="banana" name="7"></div>
		<h1> </h1>
		<div>Grapes:<input type="checkbox" value="grapes" name="8"></div>
		<h1> </h1>
		<div>Apple:<input type="checkbox" value="apple" name="9"></div>
		<h1> </h1>
		<div>Orange:<input type="checkbox" value="orange" name="10"></div>
		<h1> </h1>
		<div>Papaya:<input type="checkbox" value="papaya" name="11"></div>
		<h1> </h1>
		<input type="submit" value="Next Shop..">
	
	</form>
</body>
</html>