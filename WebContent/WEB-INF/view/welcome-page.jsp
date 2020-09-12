<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1 align="center">${myWebsiteTitle} </h1>
	<hr>
	
	<form action="processOrder">
		<div align="center">
			<label for="item_name">Item Name: </label>
			<input type="text" name="foodType" id=item_name placeholder="food type?">
			<input type="submit" value="order now">
		</div>
	</form>
	
	
	
</body>
</html>