package com.ustglobal.javaexrecise.exception;

public class Test13 {
	public static void main(String[] args) {
		System.out.println("main starded");
		int[]arr= {10,20,30};
		try {
			System.out.println(10/2);
			System.out.println(arr[4]);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("main ended");
		
	}
}
