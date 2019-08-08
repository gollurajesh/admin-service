package com.admin.service;

import java.util.List;


import com.admin.model.User;

public interface UserService {

	public User saveUser(User user);
	
	public List<User> getAllUser();
	
	public User getUserbyId(int empId);
	
	public User userLogin(User user);
}
