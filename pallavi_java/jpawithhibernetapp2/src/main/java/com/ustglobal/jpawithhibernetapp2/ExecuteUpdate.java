package com.ustglobal.jpawithhibernetapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp2.dto.EmployeeInfo;

public class ExecuteUpdate {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null; 


		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();


			EmployeeInfo executeRead=entityManager.find(EmployeeInfo.class, 10);
			executeRead.setName("pavi");
			System.out.println("updated");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}


}