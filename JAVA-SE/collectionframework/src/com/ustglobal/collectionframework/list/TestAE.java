package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class TestAE {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(10, "arjun", 10);
		Employee e2=new Employee(11,"ram",20);
		Employee e3=new Employee(12, "kumar", 30);
		Employee e4=new Employee(13, "raju",10);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println(al);
		System.out.println("================= iterator=====================");
		
		Iterator<Employee> i=al.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("=============================list iterator======================");
		ListIterator<Employee> li=al.listIterator();
		
		System.out.println("-------------------->forword------------------------------>");
		while(li.hasNext()) {
			Employee e=li.next();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("<-----------------backword<------------------------");
	
		while(li.hasPrevious()) {
			Employee e=li.previous();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("============================for loop===========================");
		for(int j=0;j<al.size();j++) {
			Employee e=al.get(j);
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
			
			
		}
		
		System.out.println("==================================for each=======================");
		for(Employee e:al) {
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
	}

}
