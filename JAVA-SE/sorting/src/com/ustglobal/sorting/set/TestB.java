package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sujay");
		hs.add("drijay");
		hs.add("enjoy");
		
		
		
		System.out.println("**************************using for each loop**********************");
		for(String s:hs)
			System.out.println(s);
		System.out.println("************************using iterator******************************");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
		String p=i.next();
		System.out.println(p);
		}
	}

}
