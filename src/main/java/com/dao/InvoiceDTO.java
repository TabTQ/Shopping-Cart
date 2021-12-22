package com.dao;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "invoiceEntity")
@Table(name = "invoice_dto")
public class InvoiceDTO{
	@Id
	private int invno;
	private Date inv_date;
	@OneToMany(mappedBy = "inv")
	private Set<InvoiceTransDTO> invtranss;
	@ManyToOne
	@JoinColumn(name = "customer_no")
	private CustomerDTO cust;
	
	public Set<InvoiceTransDTO> getInvtranss() {
		return invtranss;
	}
	public void setInvtranss(Set<InvoiceTransDTO> invtranss) {
		this.invtranss = invtranss;
	}
	public CustomerDTO getCust() {
		return cust;
	}
	public void setCust(CustomerDTO cust) {
		this.cust = cust;
	}
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public Date getInv_date() {
		return inv_date;
	}
	public void setInv_date(Date inv_date) {
		this.inv_date = inv_date;
	}
}
