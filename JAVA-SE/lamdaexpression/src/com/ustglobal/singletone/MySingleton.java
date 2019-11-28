package com.ustglobal.singletone;

public class MySingleton {
	private static MySingleton ms=null;
	String s=null;
	private MySingleton() {
		
	}
	public static MySingleton getDbConnection() {
		if(ms==null) {
			ms=new MySingleton();
			return ms;
		}
		else {
			return ms;
		}
	}

}
