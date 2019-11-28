package com.ustglobal.singletone;

public class Test {
	public static void main(String[] args) {
		MySingleton ms=MySingleton.getDbConnection();
		ms.s="hello";
		System.out.println("hash code of ms"+ms.hashCode());
		MySingleton mx=MySingleton.getDbConnection();
		mx.s="hai";
		System.out.println("hash code of mx "+mx.hashCode());
		System.out.println(mx.s);
		System.out.println(ms.s);
	}

}
