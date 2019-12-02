package com.ustglobal.jpawithhibernetapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp2.dto.EmployeeInfo;

public class ExecuteInsert {
	
	public static void main(String[] args) {
		
		EmployeeInfo employeeInfo=new EmployeeInfo();
		employeeInfo.setId(10);
		employeeInfo.setName("shriya");
		employeeInfo.setSal(10000);
		employeeInfo.setGender("f");
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null; 
		
	try {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employeeInfo);
		System.out.println("record inserted");
		entityTransaction.commit();
		
		
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
		
		
	}

}