package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		
		MyString m=new MyString(10, "kumar");
		System.out.println(m.getName());
		System.out.println(m.getRollno());
		System.out.println(m);
		MyString m1=m.changeContent(30, "rahul");
		System.out.println(m1.getName());
		System.out.println(m1.getRollno());
		System.out.println(m1);
		
		}

}
