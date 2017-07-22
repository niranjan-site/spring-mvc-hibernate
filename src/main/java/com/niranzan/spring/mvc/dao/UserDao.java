package com.niranzan.spring.mvc.dao;

import com.niranzan.spring.mvc.model.User;

public interface UserDao
{
	
	public User getUserByUUID(String uuid);
	public User getUserByUserId(String userId);
	public User createUser(String userId, String password, String email);
	public void deleteUser(User user);

}
