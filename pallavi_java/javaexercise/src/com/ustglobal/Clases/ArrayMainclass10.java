package com.ustglobal.Clases;

public class ArrayMainclass10 {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=40;
		a[4]=50;
		
		System.out.println("for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("for each..");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("***************************");
		
		byte[] b= {10,20,30};
		
		System.out.println("for loop");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("for each");
		for(int i:b) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		
		double[] c= {10.0,20.0,30.0};
		
		System.out.println("for loop");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("for each");
		for(double i:c) {
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		String[] d= {"pallavi","pavi","nagraj"};
		
		System.out.println("for loop");
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("for each");
		for(String i:d) {
			System.out.println(i);
		}
		
	}
}
