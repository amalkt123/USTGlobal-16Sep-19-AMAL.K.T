package com.ustglobal.singletone;

public class TestB {
	public static void main(String[] args) {
		MySingletonB ms=MySingletonB.getDbConnection();
		ms.s="hello";
		System.out.println("hash code of ms"+ms.hashCode());
		MySingletonB mx=MySingletonB.getDbConnection();
		mx.s="hai";
		System.out.println("hash code of mx "+mx.hashCode());
		System.out.println(mx.s);
		System.out.println(ms.s);
	}

}
