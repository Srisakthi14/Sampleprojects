package com.srisakthi.springmvcdemo.dao;

import com.srisakthi.springmvcdemo.entity.Customer;

public interface CustomerDao {

	public void saveCustomer(Customer theCustomer);

	public Customer authenticate(String userId, String password);
	
	public Customer getCustomer(int customerId);

}
