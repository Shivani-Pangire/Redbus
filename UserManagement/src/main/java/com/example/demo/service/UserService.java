package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	public void createUser(User user);
	public void deleteUser(int userId);
	public User getUser(int userId);

}
