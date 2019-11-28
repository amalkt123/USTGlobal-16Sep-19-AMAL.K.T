package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	ArrayList<Pen> al=new ArrayList<Pen>();
	
	Pen p1=new Pen(5, "lexi","blue");
	Pen p2=new Pen(10,"cello","red");
	Pen p3=new Pen(20,"renolls","black");
	Pen p4=new Pen(10, "classmate","blue");
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	System.out.println("--------------------before sort------------");
	displayPenDetails(al);
	Collections.sort(al);
	System.out.println("-------------------------after sort-------------------");
	displayPenDetails(al);
	
}
static void displayPenDetails(ArrayList<Pen> al) {
	Iterator<Pen> i=al.iterator();
	while(i.hasNext()) {
		Pen p=i.next();
		System.out.println("pen price is "+p.price);
		System.out.println("pen brand is "+p.brand);
	}
}
}

