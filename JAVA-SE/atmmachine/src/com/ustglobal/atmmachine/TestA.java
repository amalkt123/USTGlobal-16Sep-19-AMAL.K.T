package com.ustglobal.atmmachine;



public class TestA {
	public static void main(String[] args) {
		Machine m=new Machine();
		
		HDFC hdfc=new HDFC();
		m.slote(hdfc);
		
		System.out.println("*********************************************************");
		
		ICICI icici=new ICICI();
		m.slote(icici);
		
		System.out.println("*********************************************************");
		SBI sbi=new SBI();
		m.slote(sbi);
		
		
	}
	

}
