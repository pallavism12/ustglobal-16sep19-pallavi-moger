package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsert{

	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();

//			String jpql="insert into ProductInfo(pid, pname, quantity) values(:i,:n,:q)";
			String jpql ="insert into ProductInfo values(:i,:n,:q)";
			Query query =entityManager.createNativeQuery(jpql);
			
			query.setParameter("i", 100);
			query.setParameter("n", "mouse");
			query.setParameter("q", 300);
			
			int res=query.executeUpdate();
			System.out.println("inserted");
			System.out.println(res);
			
			entityTransaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();

		}
	


	}

}
