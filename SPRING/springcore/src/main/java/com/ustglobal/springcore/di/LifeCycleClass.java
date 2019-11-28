package com.ustglobal.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello=context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		//context.close(); error close method not present in ApplicationContext
		ClassPathXmlApplicationContext context2=(ClassPathXmlApplicationContext)context;
		context2.close();//close method present in ClasspathXmlApplicationContext
	}

}
