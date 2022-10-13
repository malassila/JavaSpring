package com.pizzaCastle.springMVC.domain;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer extends Order {
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;


	public Customer() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}


	

}
