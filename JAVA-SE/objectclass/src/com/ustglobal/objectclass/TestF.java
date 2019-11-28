package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		
		Cow c1=new Cow(1, "ganga", 50000);
		Cow c2=new Cow(2, "yamuna", 40000);
		Cow c3=new Cow(1, "ganga", 50000);
		Cow c4=c3;
		boolean isEqual=c1.equals(c2);
		System.out.println(isEqual);
		System.out.println(c2.equals(c3));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
	}

}
