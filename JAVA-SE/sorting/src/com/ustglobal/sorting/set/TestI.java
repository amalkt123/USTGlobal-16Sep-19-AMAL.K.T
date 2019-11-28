package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet; 
public class TestI {
public static void main(String[] args) {
	SortByName sn=new SortByName();
	SortedByPincode sp=new SortedByPincode();
	SortedByMICR sm=new SortedByMICR();
	TreeSet<Bank> ts=new  TreeSet<Bank>(sm);
	
	Bank b1=new Bank("hdfc",560068,678689);
	Bank b2=new Bank("sbi",560071,7656678);
	Bank b4=new Bank("canara",560076,123456);
	Bank b3=new Bank("citi",560054,765678);
	Bank b5=new Bank("citi",560054,765678);
	
	
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	
	System.out.println("------------------------using iterator-----------------------");
	Iterator<Bank> i=ts.iterator();
	while (i.hasNext()) {
		Bank bank = (Bank) i.next();
		System.out.println("name is "+bank.name);
		System.out.println("pincode is "+bank.pincode);
		System.out.println("MICR is "+bank.micr);
		System.out.println("=========================================================");
		
	}
	
}
}
