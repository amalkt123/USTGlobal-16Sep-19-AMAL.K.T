package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("main is started");
		
		Validator v=new Validator();
		try {
		v.verify(12);
		}
		catch(InvalidAgeException iae)
		{
			System.out.println(iae.getMessage());//reason cqcn line no
			System.out.println("exception is occured");
			System.out.println(iae);//only see message
		}
		
		System.out.println("main is ended");
	}
}
