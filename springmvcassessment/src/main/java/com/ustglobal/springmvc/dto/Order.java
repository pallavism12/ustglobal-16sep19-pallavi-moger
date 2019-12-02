package com.ustglobal.springmvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="order")
public class Order {

	@Id
	@Column
	private int orderId;
	
	private int quantity;
	private double amountPayble;
//	@Exclude
//	@OneToMany(mappedBy="order")
//	
//	private List<Product> product;
	
}
