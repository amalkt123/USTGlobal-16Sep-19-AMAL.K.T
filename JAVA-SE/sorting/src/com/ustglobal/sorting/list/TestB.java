package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
public static void main(String[] args) {
	LinkedList<Laptop> ll=new LinkedList<Laptop>();
	Laptop lp1=new Laptop(25000, 4,"hp");
	Laptop lp2=new Laptop(35000,6,"dell");
	Laptop lp3=new Laptop(100000,12,"mac");
	Laptop lp4=new Laptop(50000,8,"Asus");
	
	
	ll.add(lp1);
	ll.add(lp2);
	ll.add(lp3);
	ll.add(lp4);
	ll.add(new Laptop(20000, 2, "acer"));
	displayLaptopDetails(ll);
	Collections.sort(ll);
	System.out.println("---------------------------------after sorted-------------------------------------");
	displayLaptopDetails(ll);
	
	
	
}
static void displayLaptopDetails(LinkedList<Laptop> l) {
	Iterator<Laptop>i =l.iterator();
	while(i.hasNext()) {
	Laptop lp=i.next();
	System.out.println("brand is "+lp.brand);
	System.out.println("price is "+lp.price);
	System.out.println("ram is "+lp.ram);
	}
}
}
