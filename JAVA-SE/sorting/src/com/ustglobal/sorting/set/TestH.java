package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestH {
	
	public static void main(String[] args) {
		TreeSet<Employee> hs=new TreeSet<Employee>();
		
		
	Employee e1=new Employee(12,"sweety",45000);
	Employee e2=new Employee(34,"teju",500000);
	Employee e3=new Employee(5,"giri",25000);
	Employee e4=new Employee(25,"sheela",10000);
	Employee e5=new Employee(25,"sheela",10000); 
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	hs.toString();
 	System.out.println(hs);
//	
//	System.out.println("--------------------usig iterator-------------------------");
	
	Iterator< Employee> i=hs.iterator();
	while(i.hasNext()) {
		Employee e=i.next();
		System.out.println("id is "+e.id);
		System.out.println("name is "+e.name);
		System.out.println("salary is "+e.salary);
		System.out.println("==================================");
	}
	
	
	
	}

}
