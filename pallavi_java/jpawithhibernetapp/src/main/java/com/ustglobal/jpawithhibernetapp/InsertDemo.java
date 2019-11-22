package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.dto.ProductInfo;

public class InsertDemo {

	public static void main(String[] args) {

		ProductInfo  productInfo=new ProductInfo();
		productInfo.setPid(103);
		productInfo.setPname("book");
		productInfo.setQuantity(200);

		EntityManager  entityManager=null;
		EntityTransaction entityTransaction=null;


		try {
			EntityManagerFactory entityManagerFactory=  Persistence.createEntityManagerFactory("TestPersistence");
			entityManager= entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();

			entityTransaction.begin();
			entityManager.persist(productInfo);

			System.out.println("record saved");

			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
