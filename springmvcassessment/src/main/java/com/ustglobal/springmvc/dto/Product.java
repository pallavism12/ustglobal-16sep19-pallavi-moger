package com.ustglobal.springmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
   private int pid;
	@Column
   private String pName;
	@Column
   private double price;
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="orderId",nullable = false)
//	private Order order;
//	
	@ManyToMany(cascade=CascadeType.ALL)	
	@JoinTable(name="order_Deatils", joinColumns=@JoinColumn(name="pid"),            inverseJoinColumns = @JoinColumn(name="id"))

	private Retailer ret;
   
}
