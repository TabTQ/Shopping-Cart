package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserCheck {
	private String str;
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public UserCheck(String uname, String upass) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		try{
			User obj = (User)session.get(User.class, uname);
			String pass = obj.getUpass();
			if(upass.equals(pass)) {
				setStr("valid");
			}
			else {
				setStr("invalid");
			}
		}catch(Exception e) {
			setStr("objnf");
		}
	}
}
