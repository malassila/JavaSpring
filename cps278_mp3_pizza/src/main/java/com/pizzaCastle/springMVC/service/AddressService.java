package com.pizzaCastle.springMVC.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AddressService {
	
	public Map<String, String> populateAddressType(){
		Map<String,String> addressTypeList = new LinkedHashMap<String,String>();
		addressTypeList.put("House", "House");
		addressTypeList.put("Apartment", "Apartment");
		addressTypeList.put("Business", "Business");
		addressTypeList.put("Campus", "Campus");
		addressTypeList.put("Hotel", "Hotel");
		return addressTypeList;
	}
	public Map<String, String> populateStates(){
		Map<String,String> statesList = new LinkedHashMap<String,String>();
		  statesList.put("AL", "Alabama");
		  statesList.put("AK", "Alaska");
		  statesList.put("AZ", "Arizona");
		  statesList.put("AR", "Arkansas");
		  statesList.put("CA", "California");
		  statesList.put("CO", "Colorado");
		  statesList.put("CT", "Connecticut");
		  statesList.put("DE", "Delaware");
		  statesList.put("DC", "District Of Columbia");
		  statesList.put("FL", "Florida");
		  statesList.put("GA", "Georgia");
		  statesList.put("HI", "Hawaii");
		  statesList.put("ID", "Idaho");
		  statesList.put("IL", "Illinois");
		  statesList.put("IN", "Indiana");
		  statesList.put("IA", "Iowa");
		  statesList.put("KS", "Kansas");
		  statesList.put("KY", "Kentucky");
		  statesList.put("LA", "Louisiana");
		  statesList.put("ME", "Maine");
		  statesList.put("MD", "Maryland");
		  statesList.put("MA", "Massachusetts");
		  statesList.put("MI", "Michigan");
		  statesList.put("MN", "Minnesota");
		  statesList.put("MS", "Mississippi");
		  statesList.put("MO", "Missouri");
		  statesList.put("MT", "Montana");
		  statesList.put("NE", "Nebraska");
		  statesList.put("NV", "Nevada");
		  statesList.put("NH", "New Hampshire");
		  statesList.put("NJ", "New Jersey");
		  statesList.put("NM", "New Mexico");
		  statesList.put("NY", "New York");
		  statesList.put("NC", "North Carolina");
		  statesList.put("ND", "North Dakota");
		  statesList.put("OH", "Ohio");
		  statesList.put("OK", "Oklahoma");
		  statesList.put("OR", "Oregon");
		  statesList.put("PA", "Pennsylvania");
		  statesList.put("RI", "Rhode Island");
		  statesList.put("SC", "South Carolina");
		  statesList.put("SD", "South Dakota");
		  statesList.put("TN", "Tennessee");
		  statesList.put("TX", "Texas");
		  statesList.put("UT", "Utah");
		  statesList.put("VT", "Vermont");
		  statesList.put("VA", "Virginia");
		  statesList.put("WA", "Washington");
		  statesList.put("WV", "West Virginia");
		  statesList.put("WI", "Wisconsin");
		  statesList.put("WY", "Wyoming");
		return statesList;
	}

}
