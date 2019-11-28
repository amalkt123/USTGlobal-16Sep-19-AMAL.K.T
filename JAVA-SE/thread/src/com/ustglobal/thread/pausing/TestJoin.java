package com.ustglobal.thread.pausing;

public class TestJoin {
public static void main(String[] args) {
	System.out.println("main started");
	
	MyJoinThread t=new  MyJoinThread();
	

	t.start();
	try {
		t.join(10000);
	}
	
	catch(InterruptedException e) {
e.printStackTrace();
	}
	for(int i=0;i<10;i++)
		System.out.println("main thread");
	System.out.println("main ended");
}
}
