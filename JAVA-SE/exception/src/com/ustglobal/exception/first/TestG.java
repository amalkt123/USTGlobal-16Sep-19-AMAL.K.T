package com.ustglobal.exception.first;

public class TestG {
public static void main(String[] args) {
	System.out.println("main started");
	PayTM p=new PayTM();
	try {
	p.book();
	}
	catch(ArithmeticException ae)
	{
		System.out.println("exception caught in main");
	}
	finally {
		System.out.println("executing finally");
	}
	
	System.out.println("main ended");
}
}
