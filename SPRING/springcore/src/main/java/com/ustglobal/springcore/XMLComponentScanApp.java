package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello=context.getBean(Hello.class);
		System.out.println(hello.getMsg());
	}

}
