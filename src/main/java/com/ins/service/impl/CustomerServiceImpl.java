package com.ins.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ins.dao.CustomerDao;
import com.ins.domain.Customer;
import com.ins.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public boolean saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	public Customer customer(String customerId) {		
		return customerDao.getCustomerById(customerId);
	}

}
