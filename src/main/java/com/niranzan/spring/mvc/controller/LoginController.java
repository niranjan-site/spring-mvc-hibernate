package com.niranzan.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niranzan.spring.mvc.constants.UrlMappings;

@Controller
public class LoginController
{

	@RequestMapping(path = UrlMappings.PATH_GET_LOGIN_FORM, method = RequestMethod.GET)
	public String getLoginForm()
	{
		return "login";
	}
}
