package com.ustglobal.Clases;

public class Car4 {
	int cost;
	String color; 
	String brand;
	public Car4(int cost, String color, String brand) {
		super();
		this.cost = cost;
		this.color = color;
		this.brand = brand;
	}
	
	public int hashCode() {
		return cost;
	}
	public String toString() {
		return cost+" "+color+" "+brand;
	}
}
