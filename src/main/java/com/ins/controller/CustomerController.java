package com.ins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "it works";
	}
}