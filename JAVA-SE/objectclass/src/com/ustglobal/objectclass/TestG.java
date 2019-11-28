package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "ram", 100000);
		Employee e2=new Employee(102, "kumar", 120000);
		Employee e3=new Employee(101, "ram", 100000);
		Employee e4=e3;
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
	}

}
