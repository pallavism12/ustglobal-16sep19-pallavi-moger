package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.Query;

import com.ustglobal.jpawithhibernetapp.dto.ProductInfo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrieve {
	public static void main(String[] args) {



		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		//String jpql="from ProductInfo";
		
		String jpql="select pname from ProductInfo";
		Query query =entityManager.createQuery(jpql);

		List<String> productInfos=query.getResultList();
		
		
		for(int i=0;i<productInfos.size();i++) {
			Object res=productInfos.get(i);
			System.out.println(res);
			
			//System.out.println(productInfo.getPid());
			//System.out.println(productInfo.getPname());
			//System.out.println(productInfo.getQuantity());
		}
		
		

	}

}
