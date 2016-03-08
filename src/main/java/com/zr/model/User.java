package com.zr.model;

import java.util.Date;

public class User {
	private String name;
	private String password;
	private Date regtime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public User(String name, String password, Date regtime) {
		super();
		this.name = name;
		this.password = password;
		this.regtime = regtime;
	}
	public User() {}
	
}
