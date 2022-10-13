<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charSet="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1"
	id="dpzviewport" />
</head>
<style>
body, html {
	background: #222222;
	color: white;
	
}
.container {
   background: red;
   width: 100%;
   display: flex;
   flex-direction: row;
   flex-wrap: wrap;
   justify-content: center;
   align-items: stretch;
   text-align: center;
}
.radio {
   background: blue;
   width: 50vw;
   display: flex;
   flex-direction: row;
   flex-wrap: wrap;
   justify-content: space-around;
   align-items: center;
}
.checkbox {
	width: 20vw;
    -webkit-row-count: 3; /* Chrome, Safari, Opera */
    -moz-row-count: 3; /* Firefox */
    row-count: 3;
}
.toppings {
	height: 33vw;
	width: 80vw;
	display: flex;
	flex-direction: column;
	flex-wrap: wrap;
	
   align-items: stretch;
	justify-content: space-around;
	max-height: 30vw;
	background: #222222;
	width: 20vw;


</style>
<body>
	<div class="container">
		<form:form action="process" modelAttribute="order" class="form-style-7">
			<h1>Welcome ${order.customer}</h1>
			<br>
			<h2>Add a Pizza to your Order</h2>
			<div class="radio">
				<ul>
					<li>
						<form:label path="pizza.size" for="s-option" >Small</form:label>
						<form:radiobutton path="pizza.size" id="f-option" value="Small"/>
						<div class="check"></div>
					</li>
					<li>
						<form:label path="pizza.size" for="s-option">Medium</form:label>
						<form:radiobutton path="pizza.size" name="selector" value="Medium" id="s-option" />
						<div class="check"><div class="inside"></div></div>
					</li>
					<li>
						<form:label path="pizza.size" for="s-option">Large</form:label>
						<form:radiobutton path="pizza.size" name="selector" value="Large" id="s-option" />
						<div class="check"><div class="inside"></div></div>
					</li>
				</ul>
			</div>
			<div class="checkbox">
				<ul>
					<li>
						<div class="toppings">
							<form:label path="pizza.toppings" for="checkboxs" class="topping"></form:label>
							<form:checkboxes path="pizza.toppings" name="selector" items="${toppingsList}" id="checkboxes"  class="topping"/>
						<div class="check"><div class="inside"></div></div>
						</div>
					</li>
				</ul>
			</div>

			<div class="buttons">
                <input type="submit" name="add" value="Add Pizza" />
                <input type="submit" name="complete" value="Go to Checkout" />
			</div>
		</form:form>
	</div>

</body>
</html>

