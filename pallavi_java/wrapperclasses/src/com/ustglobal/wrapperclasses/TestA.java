package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a=10;
		System.out.println("a is "+a);
		Integer i=a;
		System.out.println("i is "+i);
		
		Integer x=89;
		System.out.println("x is "+x);
		int y=x;
		System.out.println("y is "+y);
		
		int value =Integer.parseInt("123");
		System.out.println("vlaue is "+value);
		
		//int value2 =Integer.parseInt("");
		//System.out.println("vlaue is "+value2);
		
		boolean res=Boolean.parseBoolean("false");
		System.out.println("res is "+res);
		
		boolean result=Boolean.parseBoolean("123false");
		System.out.println("res is "+result);
				
	}
}
