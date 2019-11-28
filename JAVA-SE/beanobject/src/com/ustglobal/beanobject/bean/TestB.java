package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("age is "+age);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("name is"+name);
		System.out.println("enter gender");
		String gender=sc.next();
		System.out.println("gensder is "+gender);
		System.out.println("are you male or not");
		boolean b=sc.nextBoolean();
		System.out.println("you are  male "+b);
		
	}

}
