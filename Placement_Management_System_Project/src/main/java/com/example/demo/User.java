package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	private Integer user_id;
	private String name;
	private String type;
	private String password;
	
	
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Integer user_id, String name, String type, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	
	
	
	
	

}
