package com.ustglobal.thread.pausing;

public class Counter {
	int v;
   synchronized   void increment() {
		v++;
		// TODO Auto-generated method stub

	}
   synchronized   void decrement() {
    	  v--;
		// TODO Auto-generated method stub

	}
   synchronized   void showValue() {
    	  System.out.println("v value is "+v);
		// TODO Auto-generated method stub

	}

}
