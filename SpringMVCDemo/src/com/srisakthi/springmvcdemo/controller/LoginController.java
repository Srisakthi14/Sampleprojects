package com.srisakthi.springmvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srisakthi.springmvcdemo.bean.Login;
import com.srisakthi.springmvcdemo.entity.Customer;
import com.srisakthi.springmvcdemo.service.CustomerService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	
	{
		theModel.addAttribute("customerlogin", new Login());
		
		return "login";
	}
	
	@PostMapping("/customerLogin")
	public ModelAndView login(@RequestParam String userId,@RequestParam String password) {
		
		System.out.println("User Id " +userId + "Password : "+password);
		Customer theCustomer= customerService.authenticate(userId,password);
		
		if(theCustomer!=null)
		return new ModelAndView ("home","customer",theCustomer);
		else
			return new ModelAndView ("error","message","User Name or Password is wrong");
	}

}
