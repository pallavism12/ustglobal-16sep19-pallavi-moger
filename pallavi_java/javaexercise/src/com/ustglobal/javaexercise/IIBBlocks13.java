package com.ustglobal.javaexercise;

public class IIBBlocks13 {
	static int  a;
	int b;
	{
		a=20;
		System.out.println("iib 1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		IIBBlocks13 i=new IIBBlocks13();
		IIBBlocks13 i1=new IIBBlocks13();
		System.out.println("a="+a);
	}
	{
		a=30;
		System.out.println("iib 2");
		
	}
}
