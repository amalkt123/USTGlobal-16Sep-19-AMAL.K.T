package com.ustglogal.array;

public class NonPrimitiveArray {
	public static void main(String[] args) {
		Object []s= {"sachin","shibin","rahul","kumar"};
		System.out.println("========================for loop===============================");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("===========================for each ============================");
		for(Object o:s)
			System.out.println(o);
	}

}
