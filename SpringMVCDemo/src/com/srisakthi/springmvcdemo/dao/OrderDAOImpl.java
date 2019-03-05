package com.srisakthi.springmvcdemo.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srisakthi.springmvcdemo.entity.Customer;
import com.srisakthi.springmvcdemo.entity.Orders;

@Repository
public class OrderDAOImpl implements OrderDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Orders> getAllOrders() {
		/// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery =null;
		 
		//theQuery = currentSession.createQuery("from Customer where id=:id",Customer.class);
	//	theQuery.setParameter("id", id);
		//Customer theCustomer =(Customer) theQuery.getSingleResult();
		
		
		//System.out.println(theCustomer);
				
		// create a query  ... sort by last name
		 theQuery = 
				currentSession.createQuery("from Orders" ,
											Orders.class);
		
		//theQuery.setParameter("Customer", theCustomer);
		// execute query and get result list
		List<Orders> orders = theQuery.getResultList();
				
		// return the results		
		return orders;
	}

	

	@Override
	@Transactional
	public void saveOrder(Orders theOrder) {
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(theOrder);
				
			}

	}
	
	


