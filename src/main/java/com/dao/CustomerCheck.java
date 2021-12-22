package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerCheck {
	private String str;
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public CustomerCheck(String uname) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		User obj=(User)session.get(User.class, uname);
		try {
			obj.getUpass();
			setStr("invalid");
		}catch(Exception e) {
			setStr("valid");
		}
	}
}
