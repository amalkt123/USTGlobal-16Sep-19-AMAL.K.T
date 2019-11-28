package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("good evening");
		System.out.println("==========================using iterator===========================");
		Iterator iterator=al.iterator();
//		Object o1=iterator.next();
//		System.out.println(o1);
//		Object o2=iterator.next();
//		System.out.println(o2);
//		Object o3=iterator.next();
//		System.out.println(o3);
//		Object o4=iterator.next();
//		System.out.println(o4);
//		System.out.println("hasnext method is "+iterator.hasNext());
	
	
		System.out.println("===================using for loop================================");
		for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);
		}
		
		ArrayList al1=new ArrayList();
		al1.add(12);
		al1.add(233.33);
		al1.add("moon");
		al1.add(false);
		Iterator it1=al1.iterator();
		while(it1.hasNext())
		{
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("======================================");
		ArrayList al2=new ArrayList();
		al2.add(12);
		al2.add(233.33);
		al2.add("moon");
		al2.add(false);
		Iterator it2=al2.iterator();
		for(;it2.hasNext();)
		{
			Object o=it2.next();
			System.out.println(o);
		}
				
	}

}
