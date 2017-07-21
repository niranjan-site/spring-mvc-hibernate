package com.nirazan.spring.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController 
{
	final static Logger logger = Logger.getLogger(TestController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testMethod()
	{
		logger.debug("testMethod() invoked");
		return "index";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String testMethodPost()
	{
		logger.debug("testMethodPost() invoked");
		return "index";
	}

}
