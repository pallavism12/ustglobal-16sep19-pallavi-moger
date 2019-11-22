package com.ustglobal.javaexrecise.exception;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main started");
		int arr[]= {10,20,30};
		int a=10;
		int b=0;
		try {
			b=a/0;
			System.out.println(arr[3]);
		}catch(ArithmeticException e) {
			System.out.println("no divisible by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index not present");
		}
		System.out.println(b);
		System.out.println("main ended");
	}

}
