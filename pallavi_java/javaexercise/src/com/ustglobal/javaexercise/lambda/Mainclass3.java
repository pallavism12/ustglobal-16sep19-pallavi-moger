package com.ustglobal.javaexercise.lambda;

public class Mainclass3 implements GreetInterface3{
	public static void main(String[] args) {
		GreetInterface3 g=(msg)->{
			System.out.println(msg);
			System.out.println("pallavi");
		};
		
		g.greet("hii");
	}

	@Override
	public void greet(String message) {
		// TODO Auto-generated method stub
		
	}
}
