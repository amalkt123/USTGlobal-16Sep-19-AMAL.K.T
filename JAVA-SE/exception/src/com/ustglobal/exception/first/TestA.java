package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		int a[]= {10,20,30};
		System.out.println(a[0]);
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("exception occured");
			//System.err.println(ae);
			//ae.printStackTrace();
			System.out.println("index is  not present");
			
			
		}
		System.out.println("main ended");
	}

}
