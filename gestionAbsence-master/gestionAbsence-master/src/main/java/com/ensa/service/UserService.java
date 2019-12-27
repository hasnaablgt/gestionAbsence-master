package com.ensa.service;

import java.util.List;

import com.ensa.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	public User getUserById(Long id);
	public User getUserByUsername(String username);
	public User addUser(User u);
	public User updateUser(User u);
	public void deleteUser(long id);

}
