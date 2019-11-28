package com.ustglibal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglibal.jpawithhibernate.manytomany.Course;
import com.ustglibal.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		
		
		Course c1=new Course();
		c1.setCid(3);
		c1.setCname("mca");
		Course c2=new Course();
		c2.setCid(4);
		c2.setCname("mba");
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("kumar");
		s1.setCourses(courses);
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);
			entityTransaction.commit();
			
		}catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		entityManager.close();
	}

}
