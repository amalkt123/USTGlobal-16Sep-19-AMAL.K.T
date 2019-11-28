package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a=10;
		System.out.println("a is "+a);
		Integer i=a;//Boxing or AutoBoxing
		System.out.println("i is "+i);
		
		Integer x=10;
		Integer z=new Integer(20);
		System.out.println("x is "+x);
		int y=x;//Auto UnBoxing or UnBoxing
		System.out.println("y is "+y);
		int value=Integer.parseInt("as12");
		System.out.println("value is "+value);
		
		int value1=Integer.parseInt("123");
		System.out.println("value1 is"+value1);
		byte b=Byte.parseByte("200");
		System.out.println("b is"+b);
		
		
		
		
		boolean result =Boolean.parseBoolean("true");
		System.out.println("result is "+result);
		
		boolean result1 =Boolean.parseBoolean("TruE");
		System.out.println("result1 is "+result1);

		
	}

}
