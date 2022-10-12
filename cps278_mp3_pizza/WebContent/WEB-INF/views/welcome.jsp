<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Order ${order.orderType}</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/welcomeFile.css">
</head>
<body>
	<div class="form-style-7">
		<ul>
			<li>
				<h3>Order for ${order.orderType}</h3>
				<h3>Who are we serving today?</h3>
			</li>
		</ul>
		<form:form action="processCustomer" modelAttribute="customer"
			class="form-style-7">
			<ul>
				<li><form:label path="firstName" for="firstName" />First
					Name: <form:input path="firstName" name="firstName"
						type="text" /> <span><form:errors
							path="firstName" cssClass="required" /></span></li>
				<li><form:label path="lastName" for="lastName" />Last
					Name: <form:input path="lastName" name="lastName"
						type="text" /> <span><form:errors path="customer.lastName"
							cssClass="required" /></span></li>
				<li><form:label path="address.addressType"
						for="addressType" />Address Type: <form:select
						path="address.addressType" name="addressType">
						<form:options items="${addressTypeList}" />
						<span><form:errors path="address.addressType"
								cssClass="required" /></span>
					</form:select></li>
				<li><form:label path="address.streetAddress"
						for="streetAddress" />Street Address: <form:input
						path="address.streetAddress" name="streetAddress"
						type="text" /> <span><form:errors
							path="address.streetAddress" cssClass="required" /></span></li>
				<li><form:label path="address.city" for="city" />City:
					<form:input path="address.city" name="city" type="text" />
					<span><form:errors path="address.city"
							cssClass="required" /></span></li>
				<li><form:label path="address.state" for="state" />State:
					<form:select path="address.state" name="state">
						<form:options items="${statesList}" />
					</form:select> <span><form:errors path="customer.address.state"
							cssClass="required" /></span></li>
				<li><form:label path="address.zipcode" for="zipcode" />Zipcode:
					<form:input path="address.zipcode" name="zipcode"
						type="number" /> <span><form:errors
							path="address.zipcode" cssClass="required" /></span></li>
				<li><input type="submit" value="Submit"></li>
			</ul>
		</form:form>
	</div>
	<div class="footer-1">
		<c:import
			url="file:/C:\Users\Matt\Desktop\CPS278\cps278_mp3_pizza\WebContent\resources\text\footer.txt" />
	</div>
</body>
</html>