package com.ensa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.entity.User;
import com.ensa.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		userRepository.save(u);
		
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		userRepository.save(u);
		
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	

}
