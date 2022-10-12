package com.pizzaCastle.springMVC.domain;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private Address address;

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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	

}
