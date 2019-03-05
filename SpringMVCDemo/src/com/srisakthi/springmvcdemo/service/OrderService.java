package com.srisakthi.springmvcdemo.service;

import java.util.List;

import com.srisakthi.springmvcdemo.entity.Orders;

public interface OrderService {

	

	public List<Orders> getAllOrders() ;
	public void saveOrder(Orders theOrder) ;

}
