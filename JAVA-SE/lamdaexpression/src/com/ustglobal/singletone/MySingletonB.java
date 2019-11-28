package com.ustglobal.singletone;

public class MySingletonB {
	private static final MySingletonB ms;
	static {
		ms=new MySingletonB();
	}
	String s=null;
	private MySingletonB() {
		
	}
	public static final MySingletonB getDbConnection() {
		return ms;
				}



}
