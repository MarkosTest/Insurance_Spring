package com.ins.dao.impl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ins.dao.CustomerDao;
import com.ins.domain.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public boolean saveCustomer(Customer customer){
		boolean flag = false;
		Session session = null;
		try{			
			session = sessionFactory.openSession();
			Transaction t = session.getTransaction();
			t.begin();
			session.save(customer);
			t.commit();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null){
				session.close();
			}
		}
		
		return flag;
	}
	
	@Transactional(readOnly=true)
	public Customer getCustomerById(String customerId){
		Session session = null;
		Customer customer = null;
		try{
			session = sessionFactory.openSession();
			customer = (Customer) session.get(Customer.class, customerId);
			//TODO get lazy loading
			if(customer != null)
				Hibernate.initialize(customer.getCustomerRelatives());
		} 
		catch(Exception e){
			e.printStackTrace();
		} 
		finally {
			if(session != null){
				session.close();
			}			
		}
		
		return customer;
	}
}
