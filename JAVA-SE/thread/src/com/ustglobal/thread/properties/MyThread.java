package com.ustglobal.thread.properties;

public class MyThread extends Thread{
	public static void main(String[] args) {
		System.out.println("main Started");
	
		String tname=Thread.currentThread().getName();
		System.out.println("Current Thread "+tname);
		
		MyThread t1=new MyThread();
		String mname=t1.getName();
		System.out.println("MyThread name "+mname);
		
		
		
		
		
		Thread.currentThread().setName("Bala");
		t1.setName("Golu");
		System.out.println("MyThread name is "+t1.getName());
	//	Thread.currentThread().setPriority(16); Illegal argument exception
		System.out.println(10/0);
		System.out.println("main ended");
	}

}
