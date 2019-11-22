package com.ustglobal.javaexercise.lambda;
//immutable class
public class Mainclass7 {
	public static void main(String[] args) {
		MyString7 ms=new MyString7(10, "pallavi");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
		System.out.println("****************");
		
		ms.changecontent(20, "pavi");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
	}
}
