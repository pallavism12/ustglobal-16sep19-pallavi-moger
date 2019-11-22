package com.ustglobal.javaexercise.access.pkg2;

import com.ustglobal.javaexercise.access.pkg.Demo15;

public class Sample15 extends Demo15 {
	public static void main(String[] args) {
		Demo15 e=new Demo15();
		System.out.println(e.d);
		e.m4();
		
		Sample15 s=new Sample15();
		System.out.println(s.c);
		s.m3();
		
	}
	

}
