package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("main started");
		
		ValidateAmount va=new ValidateAmount();
		try {
			va.checkAmount(20000);
			System.out.println("you can withdrow your class");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("main ented");
	}

}
