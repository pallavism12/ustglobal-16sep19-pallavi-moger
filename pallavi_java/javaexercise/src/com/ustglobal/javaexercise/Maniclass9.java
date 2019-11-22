package com.ustglobal.javaexercise;

public class Maniclass9 {
	public static void main(String[] args) {
		InSuper9 i=new InSuper9();
		i.count();
	
		System.out.println("********************");
		InSub9 i2=new InSub9();
		i2.count();
		i2.count3();
		System.out.println(i2.a);
	}

}
