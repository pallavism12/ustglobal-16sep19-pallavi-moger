package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.dto.ProductInfo;

public class UpdateDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		
		ProductInfo productInfo = entityManager.find(ProductInfo.class, 102);
		 productInfo .setPname("shreya");
		System.out.println("record updated");
		entityTransaction.commit();
		
		entityManager.close();
		
		
		
	}

}
