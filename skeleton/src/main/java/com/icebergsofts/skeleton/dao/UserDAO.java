package com.icebergsofts.skeleton.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.icebergsofts.skeleton.entities.User;


@Repository
public class UserDAO {

	@PersistenceContext(unitName="defaultPU")
	private EntityManager em;

	/**
	 * Add User
	 * 
	 * @param  User user
	 */
	public void addUser(User user) {
		em.persist(user);
	}

	/**
	 * Delete User
	 * 
	 * @param  User user
	 */
	public void deleteUser(User user) {
		em.remove(user);
	}

	/**
	 * Update User
	 * 
	 * @param  User user
	 */
	public void updateUser(User user) {
		em.merge(user);
	}

	/**
	 * Get User
	 * 
	 * @param  int User Id
	 * @return User 
	 */
	public User getUserById(int id) {
		return em.createQuery("from User where id=?", User.class).setParameter(0, id).getSingleResult();
	}

	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
	public List<User> getUsers() {
		return em.createQuery("from User").getResultList();
	}

}
