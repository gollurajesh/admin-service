package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.User;
import com.admin.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public String index() {
        return "Spring Boot Admin Example";
    }
	@GetMapping("/index")
    public String indextest() {
        return "Spring Boot Admin Example";
    }
	@PostMapping( path="/saveUser" , consumes="application/json", produces="application/json")
	public @ResponseBody User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping( path="/userLogin" , consumes="application/json", produces="application/json")
	public @ResponseBody User userLogin(@RequestBody User user) {
		return userService.userLogin(user);
	}

	@GetMapping(path = "/getAllUser", produces="application/json")
	public @ResponseBody List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PostMapping(path="/getUser", consumes="application/json", produces="application/json")
	public @ResponseBody User getUserbyId(@RequestBody int empId) {
		return userService.getUserbyId(empId);
	}
}
