package com.pizzaCastle.springMVC.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String orderType;

	private ArrayList<Pizza> pizzas;
	private Pizza pizza;
	private Customer customer;
	private Address address;
	private int pizzaID = 0;

	public Order() {

	}

	public Order(Customer customer, Address address, Pizza pizza) {
		this.customer = customer;
		this.address = address;
		this.pizza = pizza;
	}

	public int getPizzaID() {
		return pizzaID;
	}

	public void setPizzaID(int pizzaID) {
		this.pizzaID = pizzaID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPizza(Pizza pizza) {
//			this.pizza = new Pizza();
		this.pizza = pizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}


	public void addPizza(Pizza pizza) {
		try {
			this.pizzas.add(pizza);
		} catch (NullPointerException e) {
			pizzas = new ArrayList<Pizza>();
			this.pizzas.add(pizza);

		}
	}



}
