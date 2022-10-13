package com.pizzaCastle.springMVC.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	private Pizza[] pizzas = new Pizza[4];
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
			System.out.println(result.getObjectName());
			return "home";
		} else {
			System.out.println(order.getOrderType());
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

//			String size = request.getParameter("size");
//			System.out.println();
//			String[] toppings = request.getParameterValues("selector");
//			System.out.println(size);
//			System.out.println(toppings);
//			System.out.println(newOrder.getPizzaID() + " Pizza ID");
////			newOrder.setCurrentPizza(newOrder.getPizzaID(), size, toppings);
//			model.addAttribute("pizza",pizzas[newOrder.getPizzaID()]);
		 	System.out.println(newOrder.getPizza().getSize() + " PIZZA SIZE");
		 	System.out.println(newOrder.getPizza().getToppings().toString() + " PIZZA TOPPINGS");
		 	System.out.println(newOrder.getPizza() + " PIZZA");
//		 	pizzas.add(newOrder.getPizza());
		 	pizzas[newOrder.getPizzaID()] = newOrder.getPizza();
//			newOrder.addPizza(newOrder.getPizza());
			newOrder.setPizzaID(newOrder.getPizzaID() + 1);
			return "orderForm";

	}
	@RequestMapping(value = "/process", method = RequestMethod.POST, params = "complete")
	public String cancel(Model model, HttpServletRequest request, @Valid @ModelAttribute("order") Order order,
			BindingResult result) {
		System.out.println(newOrder.getPizzaID());
		for (Pizza pizza : pizzas) {
			System.out.println(pizza); 
		}
				
		newOrder.setPizzas(pizzas);
	    return "receipt";
	}
	
	

//	@RequestMapping("/process")
//	public String process(Model model, HttpServletRequest request, @Valid @ModelAttribute("order") Order order,
//			BindingResult result) {
//		try {
//			System.out.println(request.getAttribute("add") + " GET ATTRIBUTE");
//			System.out.println(request.getMethod() + " GET METHOD");
//			System.out.println(request.getLocalName() + " GET LOCAL NAME");
//			System.out.println(request.getPathInfo() + " GET PATH INFO");
//			System.out.println(request.getParameterNames() + " GET PARAMETER NAMES");
//			System.out.println(request.getRequestURI() + " GET REQUEST URI");
//			System.out.println(request.getParameter("add") + " GET PARAMETER");
//			System.out.println(result.getRawFieldValue("add") + " GET FIELD VALUE \"ADD\"");
//			System.out.println(result.getFieldValue("complete") + " GET FIELD VALUE \"COMPLETE\"");
//			System.out.println(result.getObjectName() + " GET OBJECT NAME");
//			System.out.println(result.getTarget() + " GET TARGET");
//			System.out.println(result.getModel() + " GET MODEL");
//			System.out.println(result.getErrorCount() + " GET ERROR COUNT");
//		}catch (NotReadablePropertyException e){
//			System.out.println("Error");
//		}
//		if (request.getParameter("add") != null) {
//			// add button is clicked
//			System.out.println("Add");
//			
//
//		}
//
//		if (!result.hasErrors() && request.getParameter("complete") != null) {
//			// complete button is clicked
//			System.out.println("Complete");
//
//		}
//		return "receipt";
//	}

	@ModelAttribute
	public void populateFormWithData(Model model) {
		model.addAttribute("addressTypeList", addressService.populateAddressType());
		model.addAttribute("statesList", addressService.populateStates());
		model.addAttribute("toppingsList", pizzaService.populateToppings());
		model.addAttribute("order", newOrder);
	}
}