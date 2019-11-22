package com.ustglobal.Clases;

public class StringMainclass9 {
	public static void main(String[] args) {
		String s1="pallavi";
		String s2="pavi";
		String s3=new String("pallavi");
		String s4=new String("pavi");
		String s5="pavi";
		
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(6));
		System.out.println(s1.equalsIgnoreCase(s3));
	}
}
