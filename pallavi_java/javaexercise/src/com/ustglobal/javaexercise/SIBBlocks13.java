package com.ustglobal.javaexercise;

public class SIBBlocks13 {
	static int a;
	int b;
	static {
		a=20;
		System.out.println("static block 1");
	}
	SIBBlocks13 (){
		System.out.println("contructor SIBBlocks13 ");
	}
	public static void main(String[] args) {
		SIBBlocks13  s=new SIBBlocks13();
		SIBBlocks13 s2=new SIBBlocks13 ();
		System.out.println("a= "+a);
	}
	static {
		System.out.println("static block 2");
	}
	
	static {
		a=40;
		System.out.println("static block 3");
	}
	

}
