package com.ustglobal.javaexrecise.exception;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("main started");
		Paytm10 p=new Paytm10();
		try {
			p.book();
		} catch (ArithmeticException e) {
			System.out.println("no not divisible by 0");
		}finally {
			System.out.println();
		}
	}

}
