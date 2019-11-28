package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("pet")
public class Pet {
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	public Pet(String name,Animal animal) {
		this.animal=animal;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	private String name;
	@Autowired
	@Qualifier("dog")
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	

}
