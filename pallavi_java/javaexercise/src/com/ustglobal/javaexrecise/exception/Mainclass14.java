package com.ustglobal.javaexrecise.exception;

public class Mainclass14 {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator14 v=new Validator14();
		try {
			v.verify(10);
		}catch(InvalidAgeException14 e) {
			System.out.println("exception occured");
		}
		System.out.println("main ended");
	}
	
}
