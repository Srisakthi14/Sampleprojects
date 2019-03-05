package com.srisakthi.springmvcdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srisakthi.springmvcdemo.dao.OrderDAO;
import com.srisakthi.springmvcdemo.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	@Transactional
	public List<Orders> getAllOrders() {
		
		return orderDAO.getAllOrders();
	}
	
	

	@Override
	@Transactional
	public void saveOrder(Orders theOrder) {
		
		orderDAO.saveOrder(theOrder);
	}

}
