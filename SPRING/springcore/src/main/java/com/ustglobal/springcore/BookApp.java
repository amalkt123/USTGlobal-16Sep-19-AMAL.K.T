package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Book;

public class BookApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("book.xml");
		Book book1=context.getBean(Book.class);
		System.out.println(book1.getName());
		System.out.println(book1.getAuthor().getName());
		System.out.println(book1.getAuthor().getPenName());
		System.out.println(book1.getPrice());
		ApplicationContext context2= new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
		Book book2=context2.getBean(Book.class);
		System.out.println(book2.getName());
		System.out.println(book2.getAuthor().getName());
		System.out.println(book2.getAuthor().getPenName());
		System.out.println(book2.getPrice());
		AnnotationConfigApplicationContext context22=(AnnotationConfigApplicationContext)context2;
		context22.close();
		
		
		
	}

}
