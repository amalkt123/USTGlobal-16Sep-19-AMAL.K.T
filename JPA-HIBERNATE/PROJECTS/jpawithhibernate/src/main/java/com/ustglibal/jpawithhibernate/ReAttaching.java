package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReAttaching {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
	    entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	    entityManager =entityManagerFactory.createEntityManager();
		Product product=entityManager.find(Product.class, 101);
		System.out.println(entityManager.contains(product));
	
		try {
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			product.setName("book");
			product.setQuantity(20);
			entityManager.detach(product);
			Product product2=entityManager.merge(product);
			product2.setName("book");
			product2.setQuantity(20);
					
			
			entityTransaction.commit();
			
			System.out.println(entityManager.contains(product));
			
			
		}catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		entityManager.close();
	}

}
