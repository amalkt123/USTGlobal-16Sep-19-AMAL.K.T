package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
	
		
		
		System.out.println("---------------------------usiing foreach loop-----------------");
		for(String s:ts)
           System.out.println(s);
		
		
		System.out.println("--------------using iterator------------------------");
		Iterator<String> i=ts.descendingIterator();
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
	
	}

}
