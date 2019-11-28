package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class TestBE {
	public static void main(String[] args) {
	LinkedList<Employee> ll=new LinkedList<Employee>();
		Employee e1=new Employee(10, "arjun", 10);
		Employee e2=new Employee(11,"ram",20);
		Employee e3=new Employee(12, "kumar", 30);
		Employee e4=new Employee(13, "raju",10);
		
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		
		System.out.println(ll);
		System.out.println("================= iterator=====================");
		
		Iterator<Employee> i=ll.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("=============================list iterator======================");
		ListIterator<Employee> li=ll.listIterator();
		
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
		for(int j=0;j<ll.size();j++) {
			Employee e=ll.get(j);
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
			
			
		}
		
		System.out.println("==================================for each=======================");
		for(Employee e:ll) {
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
	}

}
