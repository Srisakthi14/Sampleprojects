package com.srisakthi.springmvcdemo.dao;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srisakthi.springmvcdemo.entity.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao{

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
			
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/update the customer ... 
				currentSession.saveOrUpdate(theCustomer);
		
	}


	@Override
	public Customer authenticate(String userId, String password) {
		
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("userId",userId));
		
		boolean flag = false;
		Customer theCustomer = (Customer)criteria.uniqueResult();
		if(theCustomer!=null){
			
			if(theCustomer.getPassword().equalsIgnoreCase(password)){
				flag = true;
			}
		}
		
		if(flag==true){
			return theCustomer;
		}
		else{
			return null;
		}
	}


	@Override
	public Customer getCustomer(int customerId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				Customer theCustomer = currentSession.get(Customer.class, customerId);
				
				return theCustomer;

	}
	}


