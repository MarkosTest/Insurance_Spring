package com.ins.service;

import com.ins.domain.Customer;

public interface CustomerService {

	boolean saveCustomer(Customer customer);
	
	Customer customer(String customerId);
}
