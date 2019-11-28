package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestDT {
	public static void main(String[] args) {
		Teacher t1=new Teacher(1, "ramya", 10, "maths");
		Teacher t2=new Teacher(2, "anu", 20, "economics");
		Teacher t3=new Teacher(3, "jeevan", 30, "english");
		Teacher t4=new Teacher(4, "rajan", 10, "physics");
		
	Stack<Teacher> s=new Stack<Teacher>();
	s.add(t1);
	s.add(t2);
	s.add(t3);
	s.add(t4);
	System.out.println(s);
	System.out.println("=======================iterator=========================");
	Iterator<Teacher> i=s.iterator();
	while(i.hasNext()) {
		Teacher t=i.next();
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("=====================list iterator===========================");
	ListIterator<Teacher> li=s.listIterator();
	System.out.println("------"
			+ "---------------->forword--------------------------------->");
	while (li.hasNext()) {
		Teacher t=li.next();
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("<--------------------------backword<-----------------------------");
	while(li.hasPrevious()) {
		Teacher t=li.previous();
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("------------------------for loop---------------------------------");
	for(int j=0;j<s.size();j++) {
		Teacher t=s.get(j);
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("----------------------------for each------------------------------");
	for(Teacher t:s) {
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	}

}
