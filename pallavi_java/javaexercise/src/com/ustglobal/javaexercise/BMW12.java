package com.ustglobal.javaexercise;

public class BMW12 implements IntAuto12,IntAutoWithAbs12{
	@Override
	public int gear() {
		System.out.println(" gear of BMW12");
		return left;
	}
	@Override
	public void gps() {
		System.out.println("gps of BMW12");
		
	}
	@Override
	public void abs() {
		System.out.println("abs of BMW12");
		
		
	}
}
