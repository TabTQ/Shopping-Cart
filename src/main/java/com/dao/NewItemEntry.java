package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewItemEntry {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		ItemDTO obj = new ItemDTO();
		obj.setItemno(16);
		obj.setItemname("butter");
		obj.setPrice(270);
		obj.setUnit("500 gm");
		
		session.save(obj);
		session.beginTransaction().commit();
	}
}
