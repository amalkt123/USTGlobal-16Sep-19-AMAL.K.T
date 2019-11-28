package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestCT {
	public static void main(String[] args) {
		Teacher t1=new Teacher(1, "ramya", 10, "maths");
		Teacher t2=new Teacher(2, "anu", 20, "economics");
		Teacher t3=new Teacher(3, "jeevan", 30, "english");
		Teacher t4=new Teacher(4, "rajan", 10, "physics");
		
	Vector<Teacher> v=new Vector<Teacher>();
	v.add(t1);
	v.add(t2);
	v.add(t3);
	v.add(t4);
	System.out.println(v);
	System.out.println("=======================iterator=========================");
	Iterator<Teacher> i=v.iterator();
	while(i.hasNext()) {
		Teacher t=i.next();
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("=====================list iterator===========================");
	ListIterator<Teacher> li=v.listIterator();
	System.out.println("---------------------->forword--------------------------------->");
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
	for(int j=0;j<v.size();j++) {
		Teacher t=v.get(j);
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("----------------------------for each------------------------------");
	for(Teacher t:v) {
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	}

}
