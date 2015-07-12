package com.ins.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	
	@RequestMapping(value="/{customerId}", produces="application/json")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public Customer getCustomerById(@PathVariable String customerId, HttpServletResponse response){
		Customer customer = customerService.getCustomerById(customerId);
		//TODO return empty json instead of just blank
		return customer;
	}
	
	@RequestMapping(value="createCustomer", method=RequestMethod.POST)
	@ResponseBody
	public String createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletRequestBindingException{		
		//IOUtils apachecommons -  get bufferedreader from reqyest, then call toString from util class
		String parm = ServletRequestUtils.getStringParameter(request, "myData");
		return "esta es la variable: "+ parm;
	}
	
	@RequestMapping(value="createCustomerForm", method=RequestMethod.POST)
	@ResponseBody
	public String createCustomerForm(@DefaultValue("pepe") @FormParam("nombre") String nombre) {
		return "el teste de form: "+nombre;
	}
}