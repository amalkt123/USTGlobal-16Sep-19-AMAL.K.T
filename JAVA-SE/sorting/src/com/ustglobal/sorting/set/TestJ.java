package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortedByCid si=new SortedByCid();
		SortedByCname sn=new SortedByCname();
		SortedByCsalary  ss=new SortedByCsalary();
		TreeSet<Customer> ts=new TreeSet<Customer>(sn);
		Customer c1=new Customer("kumar", 1,40000);
		Customer c2=new Customer("krishna",2,80000);
		Customer c3=new Customer("kiran",3,50000);
		Customer c4=new Customer("praveen",4, 450000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		
		
		System.out.println("--------------------using iterator--------------------------------");
		Iterator<Customer> i=ts.iterator();
		while (i.hasNext()) {
			Customer customer = (Customer) i.next();
			System.out.println("name is "+customer.name);
			System.out.println("id is "+customer.id);
            System.out.println("salary is "+customer.salary);	
            
            System.out.println("===============================================");
		}
	}

}
