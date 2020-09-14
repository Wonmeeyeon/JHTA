package com.sample.bookstore.vo;

import java.util.Date;

public class User {
	
	private String userId;
	private String password;
	private String name;
	private String email;
	private int point;
	private Date registeredDate;
	
	public User() {}
	
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getPoint() {
		return point;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
}
