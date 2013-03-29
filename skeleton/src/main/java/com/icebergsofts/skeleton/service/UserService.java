package com.icebergsofts.skeleton.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icebergsofts.skeleton.dao.UserDAO;
import com.icebergsofts.skeleton.entities.User;

@Service
public class UserService {

	// UserDAO is injected...
	@Resource
	private transient UserDAO userDAO;
	
	/**
	 * Add User
	 * 
	 * @param  User user
	 */
	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	/**
	 * Delete User
	 * 
	 * @param  User user
	 */
	@Transactional
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
	}
	
	/**
	 * Update User
	 * 
	 * @param  User user
	 */
	@Transactional
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
	
	/**
	 * Get User
	 * 
	 * @param  int User Id
	 */
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}

	/**
	 * Get User List
	 * 
	 */
	public List<User> getUsers() {	
		return userDAO.getUsers();
	}
}
