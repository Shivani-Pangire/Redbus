package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public void createUser(User user) {
		
		userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
		
	}

	@Override
	public User getUser(int userId) {
		return userRepository.findById(userId).get();
		
	}

}
