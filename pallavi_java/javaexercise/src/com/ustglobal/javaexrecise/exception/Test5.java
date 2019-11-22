package com.ustglobal.javaexrecise.exception;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] arr= {10,20,30};
		int a=10;
		int b=0;
		try {
			  b=a/0;
			
		}catch(ArithmeticException e) {
			System.out.println("no divisible by zero");
		}try {
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index not present");
		}
		System.out.println(b);
		System.out.println("main ended");
	}
	
}
