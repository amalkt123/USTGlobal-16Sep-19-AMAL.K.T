package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;
@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	@Bean(name="hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMsg("Hello mwessage");
		return hello;
		
	}
	

}
