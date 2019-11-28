package com.ustglobal.thread.defining;

public class TestThread {
public static void main(String[] args) {
	System.out.println("main started");
MyThread t1=new MyThread();




		/*
		 * dont call run() method, it behave like normal program
		 * 
		 * all code will be executed inside main thread only
		 */
t1.start();

//t1.start(); illegal thread state exception
//t1.run(); not create new thread execution done normaly no thread is created
for(int i=0;i<10;i++)

	
	System.out.println("main thread");
System.out.println("main ended");
}
}
