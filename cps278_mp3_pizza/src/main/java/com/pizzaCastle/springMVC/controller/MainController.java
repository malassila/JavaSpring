package com.pizzaCastle.springMVC.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pizzaCastle.springMVC.domain.Customer;
import com.pizzaCastle.springMVC.domain.Order;
import com.pizzaCastle.springMVC.service.AddressService;

@Controller
public class MainController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		Order order = new Order();
		model.addAttribute("order", order);
		return "home";
	}
	
	@RequestMapping("/customerForm")
	public String newOrderCustomerPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "welcome";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(@Valid @ModelAttribute("order") Order order, BindingResult result) {
		if (result.hasErrors()) {
			return "home";
		} else {
			return "welcome";
		}
	}
	
	@RequestMapping("/processCustomer")
	public String processOrder(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "welcome";
		} else {
			return "orderForm";
		}
	}
	
	
//	@RequestMapping("/customerForm")
//	public ModelAndView newOrderCustomerPage() {
//		return new ModelAndView("welcome","customer",customer);
//	}
	
	@ModelAttribute
	public void populateFormWithData(Model model) {
		model.addAttribute("addressTypeList", addressService.populateAddressType());
		model.addAttribute("statesList", addressService.populateStates());
	}
	
	
//	@RequestMapping("/process")
//	public String processCustomer(
//			@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
//		if (result.hasErrors()) {
//			return "welcome";
//		} else {
//			return "welcome";
//		}
//	}
}
