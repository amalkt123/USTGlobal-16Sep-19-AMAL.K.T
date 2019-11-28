package com.ustglibal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class UpdateDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction  entityTransaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		
		entityManager=entityManagerFactory.createEntityManager();
		
		Student s=entityManager.find(Student.class, 1);
		if(s!=null) {
			s.setAge(12);
			s.setName("rahul");
			s.setGrade("A");
			entityTransaction.begin();
			entityManager.persist(s);
			
		
		
		}
		
	}catch (Exception e) {
		entityTransaction.rollback();
		entityTransaction.rollback();
		e.printStackTrace();
		// TODO: handle exception
	}
	entityManager.close();
}
}
