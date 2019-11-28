package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(45.3);
	al.add("yash");
	al.add(true);
	
	ListIterator li=al.listIterator();
	System.out.println("-------------------------------->forword-------------------------->");
	while(li.hasNext()) {
		Object o=li.next();
		System.out.println(o);
	}
	System.out.println("<--------------------------------back word<------------------------");
	while(li.hasPrevious()) {
		Object o=li.previous();
		System.out.println(o);
	}
}
}
