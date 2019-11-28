package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortByPrice;

public class TestF {
	public static void main(String[] args) {
		ArrayList<Marker> al=new ArrayList<Marker>();
		al.add(new Marker(50, "blue"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"green"));
        al.add(new Marker(40, "black"));
        
        
        
        System.out.println("-----------------------before sorting----------------------");
        display(al);
       // SortByPrice sb=new SortByPrice();
        SortByColor sb=new SortByColor();
        Collections.sort(al,sb);
	}
static void display(ArrayList<Marker> al)
{
	Iterator<Marker> i=al.iterator();
	while(i.hasNext()) {
		Marker m=i.next();
		System.out.println("price is "+m.price);
		System.out.println("color is "+m.color);
		System.out.println("====================================");
	}
}
}
