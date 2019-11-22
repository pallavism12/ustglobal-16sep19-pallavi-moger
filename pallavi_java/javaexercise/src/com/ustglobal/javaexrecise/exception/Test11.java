package com.ustglobal.javaexrecise.exception;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("main starded");
		try {
			Thread.sleep(3000);
			System.out.println("try block");
		}catch(InterruptedException e ) {
			e.printStackTrace();
			System.out.println("exception caught");
		}
		System.out.println("main ended");
		
	}
}
