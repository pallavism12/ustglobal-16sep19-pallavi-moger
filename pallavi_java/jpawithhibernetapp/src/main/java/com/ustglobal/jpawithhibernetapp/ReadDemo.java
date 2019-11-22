package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence") ;
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		ProductInfo productDetail=  entityManager.find(ProductInfo.class, 103);
		System.out.println("Id is "+productDetail.getPid());	
		System.out.println("Name  is "+productDetail.getPname());
		System.out.println("Quantity is "+productDetail.getQuantity());	
		entityManager.close();
	}
}
