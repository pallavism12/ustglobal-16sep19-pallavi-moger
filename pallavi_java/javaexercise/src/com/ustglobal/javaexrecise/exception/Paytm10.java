package com.ustglobal.javaexrecise.exception;

public class Paytm10 {
	void book() {
		System.out.println("paytm started");
		IRCTC10 i=new IRCTC10();
		i.confirm();
		System.out.println("paytm ended");
	}

}
