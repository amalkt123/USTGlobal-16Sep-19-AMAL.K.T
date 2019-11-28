package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {
	
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in);
				Scanner sc1=new Scanner(System.in)){
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("entered age is : "+age);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("finnaly block executed");
		}
		
	}

}
