package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
	
		Predicate<Student> p=s->s.id>=35?true:false;
		
		Student s1=new Student(1, "anup",45.6);
		boolean result=p.test(s1);
		System.out.println("result is "+result);
		
	}

}
