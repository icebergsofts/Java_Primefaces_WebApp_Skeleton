package com.icebergsofts.skeleton.ui;

import java.util.List;

import javax.annotation.Resource;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.icebergsofts.skeleton.entities.User;
import com.icebergsofts.skeleton.service.UserService;


@Component
@Scope(value="request")
public class UserManagerAction {
	
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	@Resource
	private UserService userService;
	
	@Resource
	private UserManagerModel userManagerModel;
	
	
	public void preRender() {
		if (!FacesContext.getCurrentInstance().isPostback()) {
			List<User> users = userService.getUsers();
						
			userManagerModel.setUserList(users);
		}
	}
	
	/**
	 * Add User
	 * 
	 * @return String - Response Message
	 */
	public String addUser() {
		try {
			User user = new User();
			user.setId(userManagerModel.getId());
			user.setName(userManagerModel.getName());
			user.setSurname(userManagerModel.getSurname());
			userService.addUser(user);
			
			List<User> users = userService.getUsers();
			
			userManagerModel.setUserList(users);
			
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		userManagerModel.setId(0);
		userManagerModel.setName("");
		userManagerModel.setSurname("");
	}
}