package com.ustglobal.jpawithhibernetapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp2.dto.EmployeeInfo;

public class ExecuteRead {

	public static void main(String[] args) {
		EntityManager entityManager=null;


		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();


			EmployeeInfo executeRead=entityManager.find(EmployeeInfo.class, 10);
			System.out.println("Id is "+ executeRead.getId());
			System.out.println(" Name is"+executeRead.getName());
			System.out.println("Sal is "+ executeRead.getSal());
			System.out.println(" Gender is"+executeRead.getGender());





		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	
}