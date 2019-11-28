package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class TestCE {
	public static void main(String[] args) {
      Vector<Employee> v=new Vector<Employee>();
		Employee e1=new Employee(10, "arjun", 10);
		Employee e2=new Employee(11,"ram",20);
		Employee e3=new Employee(12, "kumar", 30);
		Employee e4=new Employee(13, "raju",10);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		
		System.out.println(v);
		System.out.println("================= iterator=====================");
		
		Iterator<Employee> i=v.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("=============================list iterator======================");
		ListIterator<Employee> li=v.listIterator();
		
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
		for(int j=0;j<v.size();j++) {
			Employee e=v.get(j);
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
			
			
		}
		
		System.out.println("==================================for each=======================");
		for(Employee e:v) {
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
	}

}
