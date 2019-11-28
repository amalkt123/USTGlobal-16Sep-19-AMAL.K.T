package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product productInfo=new Product();
		productInfo.setId(101);
		productInfo.setName("pen");
		productInfo.setQuantity(10);
		
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Recored Saved");
		entityTransaction.commit();
		entityManager.close();
	}

}
