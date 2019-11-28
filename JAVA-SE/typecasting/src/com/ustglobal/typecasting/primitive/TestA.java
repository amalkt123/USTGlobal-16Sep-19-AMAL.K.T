package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
		int b=a;//Implicit casting
		System.out.println(" b is "+b);
		int p=20;
		double q=p;
		System.out.println(" q is "+q);
		System.out.println("=======================================================");
		double x=20.12;
		int y=(int) x;
		int i=-12;
		char c=(char)i;//unknown value converting int to char
		System.out.println(c);
		System.out.println("char "+c+" int "+i);
		int j=12;
		char l=(char)j;
		System.out.println(l);
	
//		byte o=9;
//		char u=o;
	}

}
