package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
public static void main(String[] args) {
	
	Stack s= new Stack();
	s.add(12);
	s.add(32.4);
	s.add("more");
	s.add(true);
	s.add(null);
	System.out.println("============using for loop=========================");
	for (int i = 0; i < args.length; i++) {
		System.out.println(s.get(i));
		
	}
	System.out.println("=============================for each loop==================");
	for (Object object : s) {
		System.out.println(object);
		
	}
	System.out.println("=========================using iterator=========================");
	Iterator i=s.iterator();
	while (i.hasNext()) {
		Object o =  i.next();
		System.out.println(o);
		
	}
	System.out.println("===========================using listiterator========================");
	ListIterator l=s.listIterator();
	System.out.println("------------------->forword--------------------------->");
	while(l.hasNext()) {
		Object o=l.next();
		System.out.println(o);
	}
	System.out.println("<------------------ -backword<-------------------------");
	while(l.hasPrevious()) {
		Object o=l.previous();
		System.out.println(o);
	}
System.out.println("=================================================================================");
}
}
