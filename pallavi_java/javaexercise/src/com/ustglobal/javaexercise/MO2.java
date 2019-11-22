package com.ustglobal.javaexercise;

public class MO2 {
	private final static void add(int a,int b) {
		System.out.println("add(int a,int b)");
	}
	
	public  void add(double a,double b) {
		System.out.println("add(double a,double b)");
	}
	public static void add(int a,double b) {
		System.out.println("add(int a,double b)");
	}
	public static void add(double a,int b) {
		System.out.println("add(double a,int b)");
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		MO2.add(10,20);
		MO2 m2=new MO2();
		m2.add(10.0, 20.0);
		//MO1.add(10.0, 20.0);
		MO2.add(10,20.0);
		MO2.add(10.0, 20);
		System.out.println("main ended");
	}

}
