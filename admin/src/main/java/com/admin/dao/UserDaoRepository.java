package com.admin.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.model.User;

public interface UserDaoRepository extends MongoRepository<User, Integer>{
	
	public List<User> findByUserNameAndPassword(String userName,String password);
	
}
