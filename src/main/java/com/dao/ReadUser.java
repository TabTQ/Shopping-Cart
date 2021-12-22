package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadUser {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		String uname = "tabishtariq";
//		Query query = session.createQuery("select u.upass from userEntity u where u.uname=:c");
//		query.setParameter("c", uname);
//		String obj = query.toString();
//		System.out.println(obj);
		User obj=(User)session.load(User.class, uname);
//		System.out.println(obj.getUpass());
		
//		User obj = (User)session.get(User.class, uname);
//		System.out.println(obj.getUpass());
		
		
	}
}
