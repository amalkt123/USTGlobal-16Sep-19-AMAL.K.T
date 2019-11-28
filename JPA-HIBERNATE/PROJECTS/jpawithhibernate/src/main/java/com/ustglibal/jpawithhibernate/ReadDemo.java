package com.ustglibal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Product productinfo=entityManager.find(Product.class, 101);//it hit the db unconditionally
		//Product productinfo=entityManager.find(Product.class, 1011); data note present NullPointer exception
		System.out.println(productinfo);//it will return actual object address
		
		System.out.println("Id : "+productinfo.getId());
		System.out.println("Nmae : "+productinfo.getName());
		System.out.println("Quantity "+productinfo.getQuantity());
		entityManager.close();
	}

}
