package com.ins.dao;

import com.ins.domain.Customer;

public interface CustomerDao {
	
	boolean saveCustomer(Customer customer);
	
	Customer getCustomerById(String customerId);
}
