package com.pizzaCastle.springMVC.controller;



import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pizzaCastle.springMVC.domain.Address;
import com.pizzaCastle.springMVC.domain.Customer;
import com.pizzaCastle.springMVC.domain.Order;
import com.pizzaCastle.springMVC.domain.Pizza;
import com.pizzaCastle.springMVC.service.AddressService;
import com.pizzaCastle.springMVC.service.PizzaService;

@Controller
public class MainController {
	@Autowired
	private AddressService addressService;
	@Autowired
	private PizzaService pizzaService;
	@Autowired
	@Qualifier("order")
	private Order newOrder = new Order(new Customer(), new Address(), new Pizza());

	@RequestMapping("/")
	public String homePage(Model model) {
		return "home";
	}

	@RequestMapping("/customerForm")
	public String newOrderCustomerPage(Model model) {
		return "customerForm";
	}

	@RequestMapping("/processOrder")
	public String processOrder(@Valid @ModelAttribute("order") Order order, BindingResult result) {

		if (result.hasErrors()) {
			return "home";
		} else {
			return "customerForm";
		}
	}

	public Order getOrder(Model model) {
		return (Order) model.getAttribute("order");
	}

	@RequestMapping("/processCustomer")
	public String processCustomer(Model model, @Valid @ModelAttribute("order") Order order, BindingResult result) {
		if (result.hasErrors()) {
			return "customerForm";
		} 

			return "orderForm";
		
	}
	
	@RequestMapping(value = "/process", params = "add")
	public String submit(Model model, HttpServletRequest request, @Valid @ModelAttribute("order") Order order, BindingResult result) {

			// Sysout are for debugging
		
		 	System.out.println(newOrder.getPizza().getSize() + " PIZZA SIZE");
		 	System.out.println(newOrder.getPizza().getToppings().toString() + " PIZZA TOPPINGS");
		 	System.out.println(newOrder.getPizza() + " PIZZA");

			newOrder.addPizza(newOrder.getPizza());
			newOrder.setPizzaID(newOrder.getPizzaID() + 1);
			newOrder.getPizzas().forEach((pizza) -> System.out.println(pizza + " -- " )); 
			return "orderForm";

	}
	@RequestMapping(value = "/process",  params = "complete")
	public String cancel(Model model, HttpServletRequest request, @Valid @ModelAttribute("order") Order order,
			BindingResult result) {
		System.out.println(newOrder.getPizzaID());
		newOrder.getPizzas().forEach((pizza) -> System.out.println(pizza + " -- " )); 
	    return "receipt";
	}
	
	
	@ModelAttribute
	public void populateFormWithData(Model model) {
		model.addAttribute("addressTypeList", addressService.populateAddressType());
		model.addAttribute("statesList", addressService.populateStates());
		model.addAttribute("toppingsList", pizzaService.populateToppings());
		model.addAttribute("order", newOrder);
	}


}