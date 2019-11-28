package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);
		hs.add(null);
		hs.add(null);
		hs.add(45);
		
		
		
		
		System.out.println("**********************using for each*************************");
		for(Object o:hs)
			System.out.println(o);
		
		
		System.out.println("*************************using iterator**************************");
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			
			System.out.println(o);
		}
	}

}
