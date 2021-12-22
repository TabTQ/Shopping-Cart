package com.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "itemEntity")
@Table(name = "item_dto")
public class ItemDTO{
	@Id
	private int itemno;
	private String itemname;
	private String unit;
	private float price;
	@OneToMany(mappedBy = "item")
	private Set<InvoiceTransDTO> invtrans;  
	
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Set<InvoiceTransDTO> getInvtrans() {
		return invtrans;
	}
	public void setInvtrans(Set<InvoiceTransDTO> invtrans) {
		this.invtrans = invtrans;
	}
	
}
