package com.ins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ins.domain.Customer;
import com.ins.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "it works";
	}
	
	//@RequestMapping(value="getUser/{customerId}", produces="application/json")
	@RequestMapping(value="getUser/{customerId}", produces="application/json")
	@ResponseBody
	public Customer getUserById(@PathVariable String customerId){
		System.out.println(customerId);
		Customer c = customerService.getCustomerById(customerId); 
		return c;
	}
}