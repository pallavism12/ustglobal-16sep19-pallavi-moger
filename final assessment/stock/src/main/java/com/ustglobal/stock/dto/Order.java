package com.ustglobal.stock.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	@Id
	@GeneratedValue
	@Column
	private int id ;
	@Column
	private double totalPrice;
	@Column
	private double totaPriceWithGst;
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@ManyToMany
	private List<Product> product;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotaPriceWithGst() {
		return totaPriceWithGst;
	}
	public void setTotaPriceWithGst(double totaPriceWithGst) {
		this.totaPriceWithGst = totaPriceWithGst;
	}
	
	
	
	

}
