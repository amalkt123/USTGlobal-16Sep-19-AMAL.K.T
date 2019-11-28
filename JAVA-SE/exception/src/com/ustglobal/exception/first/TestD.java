package com.ustglobal.exception.first;

public class TestD {
public static void main(String[] args) {
	System.out.println("main started");
	
	int a[]= {10,20,30};
	int b=10;
	try {
		
		System.out.println(b/2);//valid statement but not execute so if one statement is not depend on another statement we go for individual try block or exception handiling senario is diffrent
	}
	catch(ArithmeticException ae) {
		System.out.println("number is not divisible by zero");
	}
	try {
		System.out.println(a[4]);
	}
	catch(ArrayIndexOutOfBoundsException ai) {
		System.out.println("array index is not present");
	}
	System.out.println("main ended");
}
}
