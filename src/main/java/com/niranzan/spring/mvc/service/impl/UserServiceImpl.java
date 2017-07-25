package com.niranzan.spring.mvc.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.niranzan.spring.mvc.model.User;
import com.niranzan.spring.mvc.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	public UserServiceImpl()
	{
		logger.debug("constructor executed");
	}

	@Override
	public User getUserByUUID(String uuid)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserId(String userId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(String userId, String password, String email)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(User user)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValidUser(String userName, String password)
	{
		if("admin".equalsIgnoreCase(userName) && "admin".equalsIgnoreCase(password))
		{
			return true;
		}
		return false;
	}

}
