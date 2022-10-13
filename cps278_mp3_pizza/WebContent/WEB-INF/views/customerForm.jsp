<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Information</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/welcomeFile.css">
</head>
<body>
	<div class="main">
		<div class="form-style-7">
			<ul>
				<li>
					<h1>Order for ${order.orderType}</h1>
					<h1>Who are we serving today?</h1>
				</li>
			</ul>
			<form:form action="processCustomer" modelAttribute="order" class="form-style-7">
				<ul>
					<li>
						<form:label path="customer.firstName" for="firstName">First Name:</form:label>
						<form:input path="customer.firstName" name="firstName" type="text" />
						<span><form:errors path="customer.firstName" cssClass="required" /></span>
					</li>
					<li>
						<form:label path="customer.lastName" for="lastName">Last Name:</form:label>
						<form:input path="customer.lastName" name="lastName" type="text" />
						<span><form:errors path="customer.lastName" cssClass="required" /></span>
					</li>
					<li>
						<form:label path="address.addressType"	for="addressType">Address Type:</form:label> 
						<form:select path="address.addressType" name="addressType">
							<form:options items="${addressTypeList}" />
							<span><form:errors path="address.addressType" cssClass="required" /></span>
						</form:select>
					</li>
					<li>
						<form:label path="address.street" for="streetAddress">Street Address:</form:label>
						<form:input	path="address.street" name="streetAddress" />
						<span><form:errors path="address.street" cssClass="required" /></span>
					</li>
					<li>
						<form:label path="address.city" for="city">City:</form:label>
						<form:input path="address.city" name="city" type="text" />
						<span><form:errors path="address.city" cssClass="required" /></span></li>
					<li>
						<form:label path="address.state" for="state">State:</form:label>
						<form:select path="address.state" name="state">
							<form:options items="${statesList}" />
						</form:select>
						<span><form:errors path="address.state" cssClass="required" /></span>
					</li>
					<li>
						<form:label path="address.zipcode" for="zipcode">Zipcode:</form:label>
						<form:input path="address.zipcode" name="zipcode" type="number" />
						<span><form:errors path="address.zipcode" cssClass="required" /></span>
					</li>
					<li>
						<button type="submit" >Continue</button>
					</li>
				</ul>
			</form:form>
		</div>
		<div class="footer-1">
			<c:import
				url="file:/C:\Users\Matt\Desktop\CPS278\cps278_mp3_pizza\WebContent\resources\text\footer.txt" />
		</div>
	</div>
</body>
</html>