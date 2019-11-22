package com.ustglobal.javaexrecise.exception;
public class Test8 {
	public static void main(String[] args) {
		System.out.println("main started");
		int arr[]= {10,20,30};
		String s="hai";
		int b=10;
		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(b/2);
			System.out.println(arr[3]);

		}catch(ArithmeticException e) {
			System.out.println("arithmatic exception");
		}catch(NullPointerException e ) {
			System.out.println("dont play with null");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occurs....");
		}
		System.out.println("main ended");
	}

}