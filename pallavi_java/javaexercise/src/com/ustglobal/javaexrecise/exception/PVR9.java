package com.ustglobal.javaexrecise.exception;

public class PVR9 {
	void book() {
		try {
			System.out.println("booking started");
			System.out.println(10/2);
			System.out.println("logic for booking");
			System.out.println("booking confirmed");
		}catch(ArithmeticException e) {
			System.out.println("booking failed");
			throw e;
		}
	}
}
