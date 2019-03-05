package com.srisakthi.springmvcdemo.dao;

import java.util.List;

import com.srisakthi.springmvcdemo.entity.Orders;

public interface OrderDAO {

	List<Orders> getAllOrders();

	void saveOrder(Orders theOrder);

}
