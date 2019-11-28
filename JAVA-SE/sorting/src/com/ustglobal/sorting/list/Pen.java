package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	double price;
	String brand;
	String color;
public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color=color;
	}
//@Override
//public int compareTo(Pen o) {
//Double p1=this.price;
//Double p2=o.price;
//	return p1.compareTo(p2)*-1;
//}
//@Override
//public int compareTo(Pen o) {
//	// TODO Auto-generated method stub
//	return this.brand.compareToIgnoreCase(o.brand)*-1;
//}
@Override
public int compareTo(Pen o) {
	// TODO Auto-generated method stub
	return this.color.compareToIgnoreCase(o.color)*-1;
}

}
