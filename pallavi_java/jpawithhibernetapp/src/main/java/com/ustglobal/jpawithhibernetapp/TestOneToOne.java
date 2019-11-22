package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.onetoone.Person;
import com.ustglobal.jpawithhibernetapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		
		VoterCard voterCard=new VoterCard();
		voterCard.setVid(10);
		voterCard.setVname("abc");
		
		Person person=new Person();
		person.setPid(1);
		person.setName("def");
		person.setCard(voterCard);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {

			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();

			entityTransaction.begin();
			VoterCard vCard=entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());
		//	entityManager.persist(person);
			System.out.println("inserted");
			entityTransaction.commit();




		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();


	}

}
