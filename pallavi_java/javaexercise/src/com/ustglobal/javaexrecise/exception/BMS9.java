package com.ustglobal.javaexrecise.exception;

public class BMS9 {
	public static void main(String[] args) {
		System.out.println("main started");
		PVR9 p=new PVR9();
		
		try {
			p.book();
		}catch(ArithmeticException e) {
			System.out.println("booking failed");
		}
		System.out.println("main ended");
	}
}
