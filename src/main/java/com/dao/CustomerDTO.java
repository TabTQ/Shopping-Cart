package com.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "customerEntity")
@Table(name = "customer_dto")
public class CustomerDTO {
	@Id
	private int customer_no;
	private String customer_name;
	private String mobile;
	private String email;
	private String customer_address;
	private String customer_city;
	@OneToMany(mappedBy = "cust")
	private Set<InvoiceDTO> invoices;
	@OneToOne
	@JoinColumn(name = "uname")
	private User unamepass;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getUnamepass() {
		return unamepass;
	}
	public void setUnamepass(User unamepass) {
		this.unamepass = unamepass;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public Set<InvoiceDTO> getInvoices() {
		return invoices;
	}
	public void setInvoices(Set<InvoiceDTO> invoices) {
		this.invoices = invoices;
	}
	
}
