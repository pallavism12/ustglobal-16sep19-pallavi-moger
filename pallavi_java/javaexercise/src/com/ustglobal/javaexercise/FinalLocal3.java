package com.ustglobal.javaexercise;

public class FinalLocal3 {
	
	
	 static int a;
	 int b=10;
	 static int d=50;
	 
	public static void add() {
		final int c=20;
		int d=30;
		System.out.println(a);
		System.out.println(new FinalLocal3().b);
		System.out.println(d);
		System.out.println(FinalLocal3.d);
		System.out.println(c);
	}
	public static void main(String[] args) {
		add();

}
}
