package com.ustglibal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class SelectDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Query  query=entityManager.createQuery("from Product");
		Query  query=entityManager.createQuery("select name from Product");
		List<String> names=query.getResultList();
		for(String name:names) {
			System.out.println(name);
	  //	System.out.print(product.getId()+" ");
	   //	System.out.print(product.getName()+" ");
      //	System.out.print(product.getQuantity());
			System.out.println();
			
		}
		entityManager.close();
	
	}

}
