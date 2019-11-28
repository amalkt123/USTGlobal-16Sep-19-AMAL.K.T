package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		//null not allow non generic not allow homogenious
		
		
		
		System.out.println("********************using for each loop**********************");
		for(Object o:ts)
			System.out.println(o);
		
		
		System.out.println("*************************using iterator*********************");
		
		Iterator i=ts.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
			}
	}

}
