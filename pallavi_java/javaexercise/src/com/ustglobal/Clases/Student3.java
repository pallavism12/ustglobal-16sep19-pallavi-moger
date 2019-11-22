package com.ustglobal.Clases;

public class Student3 {
	int id;
	String name;
	double percentage;
	public Student3(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
		return id;
	}
}
