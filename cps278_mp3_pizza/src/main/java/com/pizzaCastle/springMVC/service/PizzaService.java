package com.pizzaCastle.springMVC.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PizzaService {
	
	public Map<String, String> populateToppings(){
		Map<String,String> toppingsList = new LinkedHashMap<String,String>();
		toppingsList.put("Ham", "Ham");
		toppingsList.put("Beef", "Beef");
		toppingsList.put("Salami", "Salami");
		toppingsList.put("Pepperoni", "Pepperoni");
		toppingsList.put("Sausage", "Sausage");
		toppingsList.put("Chicken", "Chicken");
		toppingsList.put("Bacon", "Bacon");
		toppingsList.put("Steak", "Steak");
		toppingsList.put("Pineapple", "Pineapple");
		toppingsList.put("Olive", "Olive");
		toppingsList.put("Mushroom", "Mushroom");
		toppingsList.put("Jalapeno", "Jalapeno");
		return toppingsList;
	}
}
