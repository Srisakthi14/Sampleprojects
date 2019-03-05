package com.srisakthi.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srisakthi.springmvcdemo.entity.Customer;
import com.srisakthi.springmvcdemo.entity.Orders;
import com.srisakthi.springmvcdemo.service.CustomerService;
import com.srisakthi.springmvcdemo.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders() {
		
		return orderService.getAllOrders();
		
	}
	
	
	
	@PostMapping("/placeorder/{customerId}")
	public @ResponseBody Orders addOrder(@RequestBody Orders theOrder,@PathVariable("customerId")int id) {
		
		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update
		
		//theOrder.setId(0);
		
		//System.out.println("Customer Id "+customerId);
		Customer theCustomer=customerService.getCustomer(id);
		
		
		System.out.println("Customer Object : "+theCustomer);
		
		theOrder.setTheCustomer(theCustomer);
		
		orderService.saveOrder(theOrder);
		
		return theOrder;
	}
	

}

