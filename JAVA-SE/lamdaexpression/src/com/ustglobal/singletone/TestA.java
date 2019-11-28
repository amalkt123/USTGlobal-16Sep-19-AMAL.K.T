package com.ustglobal.singletone;

public class TestA {
	public static void main(String[] args) {
		MySingletonA ms=MySingletonA.getDbConnection();
		ms.s="hello";
		System.out.println("hash code of ms"+ms.hashCode());
		MySingletonA mx=MySingletonA.getDbConnection();
		mx.s="hai";
		System.out.println("hash code of mx "+mx.hashCode());
		System.out.println(mx.s);
		System.out.println(ms.s);
	}

}
