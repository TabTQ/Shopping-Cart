package com.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseEntryClient {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
//		Query query=session.createQuery("select customer_no from customerEntity");
//		List<Object[]> cust = query.list();
//		int size = cust.size();
//		
//		CustomerDTO obj = new CustomerDTO();
//		obj.setCustomer_no(size);
//		obj.setCustomer_name("ghulam");
//		obj.setCustomer_city("patna");
//		obj.setCustomer_address("bihar");
//		User obj = new User();
//		obj.setUname("tabish");
//		obj.setUpass("tariq786");
		
//		Date date=new Date();
//		
//		CustomerDTO cstm = new CustomerDTO();
//		InvoiceDTO invo = new InvoiceDTO();
//		InvoiceTransDTO invt = new InvoiceTransDTO();
//		ItemDTO item = new ItemDTO();
//		
//		item.setItemno(2);
//		item.setItemname("apple");
//		item.setUnit("1kg");
//		item.setPrice(200f);
//		
//		cstm.setCustomer_no(2);
//		cstm.setCustomer_name("ram");
//		cstm.setCustomer_city("new delhi");
//		cstm.setCustomer_address("delhi");
//		Set<InvoiceDTO> invoice=new HashSet<InvoiceDTO>();
//		
//		invo.setInvno(2);
//		invo.setInv_date(date);
//		Set<InvoiceTransDTO> invoicetrans=new HashSet<InvoiceTransDTO>();
//		Set<CustomerDTO> customer=new HashSet<CustomerDTO>();
//		
//		invt.setInvno(2);
//		invt.setQty(1);
//		invt.setItem(item);
//		invoicetrans.add(invt);
//		
//		item.setInvtrans(invoicetrans);
//		invo.setInvtranss(invoicetrans);
//		invt.setInv(invo);
//		customer.add(cstm);
//		invoice.add(invo);
//		invo.setCust(cstm);
//		cstm.setInvoices(invoice);
//		
//		session.save(cstm);
//		session.save(invo);
//		session.save(invt);
//		session.save(item);
		
		
//		session.save(obj);
//		session.beginTransaction().commit();
		String uname="tabish";
		User obj=(User)session.get(User.class, uname);
		try {
			obj.getUpass();
			System.out.println("user found");
		}catch(Exception e) {
			System.out.println("not found");
		}
	}
}
