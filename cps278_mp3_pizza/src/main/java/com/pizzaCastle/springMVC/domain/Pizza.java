package com.pizzaCastle.springMVC.domain;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pizza {
	private String size;
	private String[] toppings;
	
	public Pizza() {
		
	}
	
	public Pizza(String size, String[] toppings) {
		this.size = size;
		this.toppings = toppings;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + Arrays.toString(toppings) + "]";
	}

}
