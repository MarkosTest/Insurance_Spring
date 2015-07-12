package com.ins.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ins.dao.CustomerDao;
import com.ins.domain.Customer;
import com.ins.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	public boolean saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public Customer getCustomerById(String customerId) {		
		return customerDao.getCustomerById(customerId);
	}

	public String createCustomer(HttpServletRequest request, HttpServletResponse response) {	
		return null;
	}

	@Override
	public String createCustomer() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
