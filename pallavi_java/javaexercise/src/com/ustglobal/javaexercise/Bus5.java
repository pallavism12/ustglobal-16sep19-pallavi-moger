package com.ustglobal.javaexercise;

public class Bus5 {
	
	int seats;
	String color;
	public Bus5(int seats,String color) { 
		this.seats=seats;
		this.color=color;

	}
	public Bus5() {
		this(40);
	}
	public Bus5(int seats) {
		this(seats,"red");
	}
	void display() {
		System.out.println(seats);
		System.out.println(color);
	}
}