package com.ustglobal.javaexercise;

public class InSub9 extends InSuper9{
	int b=10;
	public  void count() {
		super.count();

		//System.out.println("count of subclass....");
	}
	
	public final void count2() {
		System.out.println("count2 of subclass....");
	}
	
}
