package com.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "invoicetransEntity")
@Table(name = "invoicetrans_dto")
public class InvoiceTransDTO{
	@Id
	private int invtransno;
	private int qty;
	@ManyToOne
	@JoinColumn(name = "item_no")
	private ItemDTO item;
	@ManyToOne
	@JoinColumn(name = "inv_no")
	private InvoiceDTO inv;
	
	public int getInvno() {
		return invtransno;
	}
	public void setInvno(int invtransno) {
		this.invtransno = invtransno;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public ItemDTO getItem() {
		return item;
	}
	public void setItem(ItemDTO item) {
		this.item = item;
	}
	public InvoiceDTO getInv() {
		return inv;
	}
	public void setInv(InvoiceDTO inv) {
		this.inv = inv;
	}
	
	
}
