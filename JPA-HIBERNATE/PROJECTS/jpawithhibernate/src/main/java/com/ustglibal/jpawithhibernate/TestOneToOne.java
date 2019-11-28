package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglibal.jpawithhibernate.onetoone.Person;
import com.ustglibal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
public static void main(String[] args) {
	VoterCard card=new VoterCard();
	card.setVid(2);
	card.setVname("ram");
	Person person=new Person();
	person.setId(3);
	person.setName("ram");
    person.setCard(card);	
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println(person);
		entityManager.persist(person);
		entityTransaction.commit();
		VoterCard card2=entityManager.find(VoterCard.class, 2);
		System.out.println(card2.getPerson().getId());

		
	}catch (Exception e) {
		//entityTransaction.rollback();
		//e.printStackTrace();
		// TODO: handle exception
	}

}
}
