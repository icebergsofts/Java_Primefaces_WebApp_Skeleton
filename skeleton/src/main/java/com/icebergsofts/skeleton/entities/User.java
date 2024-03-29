package com.icebergsofts.skeleton.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dodo")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1301301590798603211L;
	private Integer id;
	private String name;
	private String surname;
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	
	/**
	 * Set User Id
	 * 
	 * @param int - User Id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Get User Name
	 * 
	 * @return String - User Name
	 */
	@Column(name="name", unique = true, nullable = false)
	public String getName() {
		return name;
	}
	
	/**
	 * Set User Name
	 * 
	 * @param String - User Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get User Surname
	 * 
	 * @return String - User Surname
	 */
	@Column(name="surname", unique = true, nullable = false)
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}	
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		strBuff.append(", surname : ").append(getSurname());
		return strBuff.toString();
	}
}
