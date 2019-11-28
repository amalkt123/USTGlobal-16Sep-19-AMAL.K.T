package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		System.out.println("Main staretd");
		System.out.println(Thread.currentThread().getId());
		
		
		
		MyIdThread mi=new MyIdThread();
		System.out.println("myid thread "+mi.getId());
	//	mi.setId(); wecannot setId it is unique given by thr=e JVM
		
		
		System.out.println("prority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(16);
		System.out.println("Main ended");
	}

}
