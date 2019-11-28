package com.ustglobal.lamdaexpressions;

public interface TestMultiply {
	public static void main(String[] args) {
		MultiplyInterface multiplyInterface=(a,b)->a*b;
		//MultiplyInterface multiplyInterface=(int a,int b)->a*b; possible
		//MultiplyInterface multiplyInterface=(int a, b)->a*b; not possible
		//MultiplyInterface multiplyInterface=(a, int b)->a*b; not possible
		int product=multiplyInterface.multiply(10, 20);
		System.out.println("product is "+product);
		
		
	}

}
