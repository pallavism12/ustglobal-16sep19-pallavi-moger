package com.ustglobal.sorting;

public class Laptop implements Comparable<Laptop> {
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo(Laptop l) {
//		Integer i=this.ram;
//		Integer j=l.ram;
//		return i.compareTo(j);
//	}
	
	@Override
	public int compareTo(Laptop l) {
		Double d=this.price;
		Double e=l.price;
		return d.compareTo(e);
		
	}
}
