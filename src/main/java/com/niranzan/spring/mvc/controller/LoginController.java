package com.niranzan.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niranzan.spring.mvc.constants.UrlMappings;
import com.niranzan.spring.mvc.model.User;
import com.niranzan.spring.mvc.service.UserService;

@Controller
public class LoginController
{
	@Autowired
	UserService userService;

	@RequestMapping(path = UrlMappings.PATH_GET_LOGIN_FORM, method = RequestMethod.GET)
	public String getLoginForm(Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(path = UrlMappings.PATH_POST_PROCESS_LOGIN, method =  RequestMethod.POST)
	public ModelAndView processLogin(HttpServletRequest request, HttpServletResponse resposne, @ModelAttribute User user)
	{
		ModelAndView modelAndView = null;
		System.out.println("user--> " + user.getUserId());
		System.out.println("pwd--> " + user.getPassword());
		System.out.println("servc--> " + userService);
		
		if(userService.isValidUser(user.getUserId(), user.getPassword()))
		{
			modelAndView = new ModelAndView("home");
			return modelAndView;
		}
		
		return new ModelAndView("index");
	}
}
