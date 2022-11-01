package com.learn.springReact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springReact.model.User;
import com.learn.springReact.repo.UserRepository;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	User nUser(@RequestBody User nUser) {
		return userRepository.save(nUser);
		
	}
	@GetMapping("/users")
	List<User> getAllUsers(){
		return userRepository.findAll();
	}

}
