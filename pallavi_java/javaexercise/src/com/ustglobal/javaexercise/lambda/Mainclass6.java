package com.ustglobal.javaexercise.lambda;

public class Mainclass6 {
	public static void main(String[] args) {
		MySingleton6 ms=new MySingleton6().getConnection();
		ms.s="hello";
		System.out.println(ms.hashCode());
		
		MySingleton6 mx=MySingleton6.getConnection();
		mx.s="hi";
		System.out.println(mx.hashCode());
	}
}
