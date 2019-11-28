package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	
	LinkedList li=new LinkedList();
	li.add(12);
	li.add(32.4);
	li.add("more");
	li.add(true);
	li.add(null);
	System.out.println("============using for loop=========================");
	for (int i = 0; i < args.length; i++) {
		System.out.println(li.get(i));
		
	}
	System.out.println("=============================for each loop==================");
	for (Object object : li) {
		System.out.println(object);
		
	}
	System.out.println("=========================using iterator=========================");
	Iterator i=li.iterator();
	while (i.hasNext()) {
		Object o =  i.next();
		System.out.println(o);
		
	}
	System.out.println("===========================using listiterator========================");
	ListIterator l=li.listIterator();
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
