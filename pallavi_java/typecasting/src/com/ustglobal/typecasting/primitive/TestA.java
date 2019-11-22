package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
		int b=a;
		System.out.println("b is :"+b);
		System.out.println("*******************************");
		
		int p=40;
		double q=p;
		System.out.println("q is :"+q);
		System.out.println("********************************");
		
		
		double r=111.87;
		int i=(int) r;
		System.out.println("i is:"+i);
		byte g=(byte)r;
		System.out.println("g is :"+g);
	}
	
	
}
