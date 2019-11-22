package com.ustglobal.javaexrecise.exception;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("main started");
		String s=null;
		try {
			  String s1=s.toLowerCase();
			  System.out.println(s1);
			
		}catch(NullPointerException e) {
			System.out.println("don't play with null");
		}
	
		System.out.println("main ended");
	}
	
}
