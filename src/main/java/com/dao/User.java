package com.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "userEntity")
@Table(name = "userdata")
public class User {
	@Id
	private String uname;
	private String upass;
	@OneToOne(mappedBy = "unamepass")
	private CustomerDTO user;
	
	public CustomerDTO getUser() {
		return user;
	}
	public void setUser(CustomerDTO user) {
		this.user = user;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
}
