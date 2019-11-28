package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestAT {
	public static void main(String[] args) {
		Teacher t1=new Teacher(1, "ramya", 10, "maths");
		Teacher t2=new Teacher(2, "anu", 20, "economics");
		Teacher t3=new Teacher(3, "jeevan", 30, "english");
		Teacher t4=new Teacher(4, "rajan", 10, "physics");
		
	ArrayList<Teacher> al=new ArrayList<Teacher>();
	al.add(t1);
	al.add(t2);
	al.add(t3);
	al.add(t4);
	System.out.println(al);
	System.out.println("=======================iterator=========================");
	Iterator<Teacher> i=al.iterator();
	while(i.hasNext()) {
		Teacher t=i.next();
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("=====================list iterator===========================");
	ListIterator<Teacher> li=al.listIterator();
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
	for(int j=0;j<al.size();j++) {
		Teacher t=al.get(j);
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	System.out.println("----------------------------for each------------------------------");
	for(Teacher t:al) {
		System.out.println("teacher id is : "+t.id);
		System.out.println("Teacher name is : "+t.name);
		System.out.println("teacher department no: "+t.deptno);
		System.out.println("Teacher subject is : "+t.subject);
		System.out.println(t);
	}
	}

}
