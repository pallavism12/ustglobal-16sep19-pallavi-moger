package com.ustglobal.javaexercise.access.pkg;

public class Demo15 {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void m1() {
		System.out.println("private...");
	}
	void m2() {
		System.out.println("default...");
	}
	protected void m3() {
		System.out.println("protected..");
	}
	public void m4() {
		System.out.println("public....");
	}
	public static void main(String[] args) {
		
		Demo15 d=new Demo15();
		System.out.println(d.a);
		d.m1();
		
	}
}
