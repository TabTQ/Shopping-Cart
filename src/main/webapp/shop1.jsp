<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop1</title>
</head>
<body bgcolor="green">
<h1>Vegetable Shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop1">
		
		<div>Brinjal:<input type="checkbox" value="brinjal" name="0"></div>
		<h1> </h1>
		<div>Potato:<input type="checkbox" value="potato" name="1"></div>
		<h1> </h1>
		<div>Tomato:<input type="checkbox" value="tomato" name="2"></div>
		<h1> </h1>
		<div>Cucumber:<input type="checkbox" value="cucumber" name="3"></div>
		<h1> </h1>
		<div>Beetroot:<input type="checkbox" value="beetroot" name="4"></div>
		<h1> </h1>
		<div>Carrot:<input type="checkbox" value="carrot" name="5"></div>
		<h1> </h1>
		<input type="submit" value="Next Shop..">
	
	</form>
</body>
</html>