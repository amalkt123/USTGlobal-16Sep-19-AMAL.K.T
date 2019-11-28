package com.ustglobal.lamdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {
		FactorialInterface factorialInterface=(x)->{
			int fact=1;
			for(int i=2;i<=x;i++)
				fact*=i;
			return fact;
		};
		int factorial=factorialInterface.fact(10);
		System.out.println("factorial is "+factorial);
	}

}
