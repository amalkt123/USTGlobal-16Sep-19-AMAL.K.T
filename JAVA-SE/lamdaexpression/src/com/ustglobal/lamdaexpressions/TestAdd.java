package com.ustglobal.lamdaexpressions;

public class TestAdd implements AddInterface {
public static void main(String[] args) {

	TestAdd ta=new TestAdd();
	int sum=ta.add(12, 20);
	System.out.println("sum is "+sum);
}

@Override
public int add(int a, int b) {
	return a*b;
	
}
}
