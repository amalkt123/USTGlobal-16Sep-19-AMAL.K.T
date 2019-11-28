package com.ustglobal.thread.pausing;

public class MyJoinThread  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10; i++) {
			System.out.println("child thread");
		try {
			Thread.sleep(2000);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
