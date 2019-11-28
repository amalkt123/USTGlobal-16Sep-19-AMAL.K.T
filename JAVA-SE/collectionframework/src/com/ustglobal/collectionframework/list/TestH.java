package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
public static void main(String[] args) {
	
	Vector v=new Vector();
	v.add(12);
	v.add(32.4);
	v.add("more");
	v.add(true);
	v.add(null);
	System.out.println("============using for loop=========================");
	for (int i = 0; i < args.length; i++) {
		System.out.println(v.get(i));
		
	}
	System.out.println("=============================for each loop==================");
	for (Object object : v) {
		System.out.println(object);
		
	}
	System.out.println("=========================using iterator=========================");
	Iterator i=v.iterator();
	while (i.hasNext()) {
		Object o =  i.next();
		System.out.println(o);
		
	}
	System.out.println("===========================using listiterator========================");
	ListIterator l=v.listIterator();
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
