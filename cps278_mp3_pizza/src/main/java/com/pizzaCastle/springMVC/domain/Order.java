package com.pizzaCastle.springMVC.domain;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String orderType;
	private Pizza[] pizzas;
	private Customer customer;
	
	public Order() {
		
	}

	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Pizza[] getPizzas() {
		return pizzas;
	}
	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}


	public String getOrderType() {
		return orderType;
	}


	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


}
