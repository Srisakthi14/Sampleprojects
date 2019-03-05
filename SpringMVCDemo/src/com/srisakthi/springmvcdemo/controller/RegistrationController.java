package com.srisakthi.springmvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srisakthi.springmvcdemo.entity.Customer;
import com.srisakthi.springmvcdemo.service.CustomerService;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	// need to inject our customer service
		@Autowired
		private CustomerService customerService;

	@RequestMapping("/showForm")
	public String showRegistrationForm(Model theModel) {
		
		theModel.addAttribute("customer",new Customer());
		return "registration-form";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);	
		
		return "success";
	}
}
