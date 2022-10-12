<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charSet="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1"
	id="dpzviewport" />
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css">
<body>
	<div class="container">
		<form:form action="processOrder"
			modelAttribute="order" class="form-style-7">
			<h1>Welcome to Pizza Castle</h1>
			<br>
			<h2>How do you want your Pizza Castle today?</h2>
			<form:label path="orderType" for="pick-up" />Pick-Up
			<form:radiobutton path="orderType" name="pick-up" />
			<form:label path="orderType" for="delivery" />Delivery
			<form:radiobutton path="orderType" name="delivery" />
			<input type="submit" value="Submit">
		</form:form>
	</div>
		<div class="footer-1">
			<c:import url="file:/C:\Users\Matt\Desktop\CPS278\cps278_mp3_pizza\WebContent\resources\text\footer.txt" />
		</div>
</body>
</html>

