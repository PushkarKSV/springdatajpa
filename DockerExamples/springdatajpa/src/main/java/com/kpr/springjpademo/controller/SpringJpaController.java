package com.kpr.springjpademo.controller;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpr.springjpademo.repository.UserRepository;
import com.kpr.springjpademo.repository.Users;

@RestController
@RequestMapping("/all")
@Configuration
public class SpringJpaController {
	private UserRepository userRepository;
	
	SpringJpaController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public List<Users> createUser(@RequestBody Users user) {
		userRepository.save(user);
		return userRepository.findAll();
		
	}
}