package com.ustglobal.javaexercise.lambda;

public class MySingleton6 {
	
	private static MySingleton6 instance=null;
	String s;
	MySingleton6() {
		
	}
	public  static MySingleton6 getConnection() {
		if(instance ==null) {
			instance=new MySingleton6();
			return instance;
		}
		else {
			return instance;
		}
	}
}
