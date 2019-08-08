package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.UserDaoRepository;
import com.admin.model.User;
import com.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDaoRepository userDaoRepository;
	
	@Override
	public User saveUser(User user) {
		return userDaoRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDaoRepository.findAll();
	}

	@Override
	public User getUserbyId(int empId) {
		return userDaoRepository.findById(empId).get();
	}
	
	@Override
	public User userLogin(User user) {
		List<User> liUser = userDaoRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(liUser.size() > 0) {
			return liUser.get(0);
		}else {
			return null;
		}
	}

}
