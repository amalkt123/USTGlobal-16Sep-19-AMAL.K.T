package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestDE {
	public static void main(String[] args) {
      Stack<Employee> s=new Stack<Employee>();
		Employee e1=new Employee(10, "arjun", 10);
		Employee e2=new Employee(11,"ram",20);
		Employee e3=new Employee(12, "kumar", 30);
		Employee e4=new Employee(13, "raju",10);
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		
		System.out.println(s);
		System.out.println("================= iterator=====================");
		
		Iterator<Employee> i=s.iterator();
		while(i.hasNext()) {
			Employee e=i.next();
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department is : "+e.deptno);
			System.out.println(e);
		}
		System.out.println("=============================list iterator======================");
		ListIterator<Employee> li=s.listIterator();
		
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
		for(int j=0;j<s.size();j++) {
			Employee e=s.get(j);
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
			
			
		}
		
		System.out.println("==================================for each=======================");
		for(Employee e:s) {
			System.out.println("employee id is : "+e.eid);
			System.out.println("employee name is : "+e.name);
			System.out.println("employee department no is : "+e.deptno);
			System.out.println(e);
		}
	}

}
