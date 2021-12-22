<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop3</title>
</head>
<body bgcolor="yellow">
<h1>Grocery Shop</h1>
	<form action="shopping.do" method="post">
		<input type="hidden" name="formid" value="shopping">
		<input type="hidden" name="shopid" value="shop3">
		
		<div>Rice:<input type="checkbox" value="rice" name="12"></div>
		<h1> </h1>
		<div>Daal:<input type="checkbox" value="daal" name="13"></div>
		<h1> </h1>
		<div>Oil:<input type="checkbox" value="oil" name="14"></div>
		<h1> </h1>
		<div>Milk:<input type="checkbox" value="milk" name="15"></div>
		<h1> </h1>
		<div>Butter:<input type="checkbox" value="butter" name="16"></div>
		<h1> </h1>
		
		<input type="submit" value="Next Shop..">
	
	</form>
</body>
</html>