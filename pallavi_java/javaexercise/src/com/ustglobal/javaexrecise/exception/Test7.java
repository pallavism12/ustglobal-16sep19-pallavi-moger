package com.ustglobal.javaexrecise.exception;
public class Test7 {
	public static void main(String[] args) {
		System.out.println("main started");
		int arr[]= {10,20,30};
		String s="hello";
		int b=10;
		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(arr[1]);
			System.out.println(b/0);
		}catch(ArithmeticException e) {
			System.out.println("no divisible by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index not present");
		}

		System.out.println("main ended");
	}

}