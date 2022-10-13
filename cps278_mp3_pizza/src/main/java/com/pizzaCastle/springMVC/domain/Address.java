package com.pizzaCastle.springMVC.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pizzaCastle.springMVC.service.AddressService;

@Component
public class Address extends Order {

	@NotBlank(message="This field is required")
	private String addressType;
	@NotBlank(message="This field is required")
	private String street;
	@NotBlank(message="This field is required")
	private String city;
	@NotBlank(message="This field is required")
	private String state;
	@NotBlank(message="This field is required")
	@Pattern(regexp = "^[0-9]{5}", message = "Invalid zip code")
	private int zipcode;
	
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return addressType + ": " + street + ",\n" + city + ", " + state + "\n" + zipcode;
	}
}
