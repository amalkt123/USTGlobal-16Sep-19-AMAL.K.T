package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	LinkedHashSet ls=new LinkedHashSet();
	ls.add(24);
	ls.add("nikitha");
	ls.add(89.9);
	ls.add(34);
	ls.add("bhavya");
	
	
	System.out.println("**************************using foreach loop*******************************");
	for(Object o:ls)
		System.out.println(ls);
	System.out.println("*************************using iterator*********************************");
	Iterator i=ls.iterator();
	
	while(i.hasNext()) {
	Object o=i.next();
	System.out.println(o);
	}

}
}
