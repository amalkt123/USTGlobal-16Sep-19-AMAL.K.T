package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
        
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
	    entityManager=entityManagerFactory.createEntityManager();
		Product productinfo=entityManager.getReference(Product.class, 101);//not hit the db right now
		//	Product productinfo=entityManager.getReference(Product.class, 1011); data not present---->entity not found exception 
		System.out.println(productinfo);//it will print proxy object address
		
		System.out.println("Id : "+productinfo.getId());//hit the db
		System.out.println("Nmae : "+productinfo.getName());//hit the db
		System.out.println("Quantity "+productinfo.getQuantity());//hit the db
		entityManager.close();

	}

}
