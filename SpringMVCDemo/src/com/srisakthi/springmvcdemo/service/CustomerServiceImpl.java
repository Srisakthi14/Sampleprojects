package com.srisakthi.springmvcdemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srisakthi.springmvcdemo.dao.CustomerDao;
import com.srisakthi.springmvcdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDao.saveCustomer(theCustomer);
		
	}


	@Override
	@Transactional
	public Customer authenticate(String userId, String password) {
		
		Customer theCustomer = customerDao.authenticate(userId,password);
		return theCustomer;
	}


	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		Customer theCustomer = customerDao.getCustomer(customerId);
		return theCustomer;
	}

}
