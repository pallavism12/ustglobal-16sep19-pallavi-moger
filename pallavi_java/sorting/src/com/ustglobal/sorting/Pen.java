package com.ustglobal.sorting;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color=color;
	}
	@Override
	public int compareTo(Pen s) {
		Double i=this.price;
		Double j=s.price;
		return i.compareTo(j);
	}
	
}
