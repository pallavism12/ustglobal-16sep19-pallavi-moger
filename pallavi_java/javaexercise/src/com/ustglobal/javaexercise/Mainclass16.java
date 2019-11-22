package com.ustglobal.javaexercise;

public class Mainclass16 {
	public static void main(String[] args) {
		Machine16 m=new Machine16();
		
		SBI16 s=new SBI16();
		m.slot(s);
		System.out.println("******************");
		HDFC16 s1=new HDFC16();
		m.slot(s1);
		System.out.println("******************");
		ICICI16 s2=new ICICI16();
		m.slot(s2);
		
	}

}
