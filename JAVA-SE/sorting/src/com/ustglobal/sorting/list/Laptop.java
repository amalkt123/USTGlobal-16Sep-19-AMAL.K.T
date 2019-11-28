package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
double price;
public Laptop(double price, int ram, String brand) {
	super();
	this.price = price;
	this.ram = ram;
	this.brand = brand;
}
int ram;
String brand;
//@Override
//public int compareTo(Laptop o) {
//	Integer r1=this.ram;
//	Integer r2=o.ram;
//	return r1.compareTo(r2);
//}
//@Override
//public int compareTo(Laptop o) {
//	Integer r1=this.price;
//	Integer r2=o.price;
//	return r1.compareTo(r2);
//}
@Override
	public int compareTo(Laptop o) {
	
		return this.brand.compareToIgnoreCase(o.brand);
	}
}
