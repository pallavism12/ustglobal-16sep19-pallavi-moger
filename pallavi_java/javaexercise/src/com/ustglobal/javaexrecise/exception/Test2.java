package com.ustglobal.javaexrecise.exception;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main started");
		int a=10;
		int b=0;
		try {
			  b=a/0;
			
		}catch(ArithmeticException e) {
			System.out.println("no divisible by zero");
		}
		System.out.println(b);
		System.out.println("main ended");
	}
	
}
