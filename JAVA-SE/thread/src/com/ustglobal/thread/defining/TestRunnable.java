package com.ustglobal.thread.defining;

public class TestRunnable {
	public static void main(String[] args) {
//		Runnable runnable=()->{
//			for(int i=0;i<10;i++)
//				System.out.println("child thread");
//		};
//		Thread t1=new Thread(runnable);
//		t1.start();
		
		MyRunnbale myRunnbale=new MyRunnbale();
		Thread t2=new Thread(myRunnbale);
		t2.start();
		for(int i=0;i<10;i++)
			System.out.println("main thread");
	}

}
