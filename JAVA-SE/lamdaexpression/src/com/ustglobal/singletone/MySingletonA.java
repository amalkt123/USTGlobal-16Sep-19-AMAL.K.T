package com.ustglobal.singletone;

public class MySingletonA {
		private static final MySingletonA ms=new MySingletonA();
		String s=null;
		private MySingletonA() {
			
		}
		public static final MySingletonA getDbConnection() {
			return ms;
					}




}
