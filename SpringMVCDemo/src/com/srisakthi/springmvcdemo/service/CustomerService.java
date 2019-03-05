package com.srisakthi.springmvcdemo.service;

import com.srisakthi.springmvcdemo.entity.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer theCustomer);

	public Customer authenticate(String userId, String password);
	
	public Customer getCustomer(int customerId);

}
