package com.ustglobal.java8features.predicates;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Employee e1=new Employee(10, "kumar",10000);
		Predicate<Employee> p=(s)->s.salary>100000?true:false;
		
		System.out.println("you are leve one employee "+p.test(e1));
	}

}
