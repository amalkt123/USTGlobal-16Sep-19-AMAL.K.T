package com.ustglobal.sorting.set;

import java.awt.HeadlessException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {
	public static void main(String[] args) {
		Comparator< Employee1> comparator=(c1,c2)->{
			 
			return c1.name.toLowerCase().compareTo(c2.name.toLowerCase());
		};
		
		
		TreeSet<Employee1> ts=new TreeSet<Employee1>(comparator);
		Employee1 e1=new Employee1(4, "niki",5.6);
		Employee1 e2=new Employee1(1, "baskar",5.2);
		Employee1 e3=new Employee1(5,"suresh",5.1);
		Employee1 e4=new Employee1(2,"dinesh",4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		
		System.out.println("----------------------suing iterator-----------------");
		Iterator<Employee1> i=ts.iterator();
		while (i.hasNext()) {
			Employee1 employee1 = (Employee1) i.next();
			System.out.println("name is "+employee1.name);
			System.out.println("id is "+employee1.id);
			System.out.println("height is "+employee1.height);
			System.out.println("================================================");
			
		}
	}

}
