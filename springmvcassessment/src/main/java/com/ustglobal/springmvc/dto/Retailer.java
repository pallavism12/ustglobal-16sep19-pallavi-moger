package com.ustglobal.springmvc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="retailer")
public class Retailer {
     @Id
     @Column
     
	private int id;
     @Column
	private String name;
     @Column
	private String email;
     @Column
     private String password;
	

 	@Exclude
 	@ManyToMany( cascade=CascadeType.ALL,mappedBy = "retailer")
 	 	private Product product;
}
