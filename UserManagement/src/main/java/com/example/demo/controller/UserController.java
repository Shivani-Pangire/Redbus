package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
    @PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		userService.createUser(user);
		return "Created";
	}

	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		userService.deleteUser(userId);
		return "Deleted";
	}
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}

}
