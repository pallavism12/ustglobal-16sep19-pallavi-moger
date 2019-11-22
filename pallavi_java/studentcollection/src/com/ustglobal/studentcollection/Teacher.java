package com.ustglobal.studentcollection;

public class Teacher {
	int exp;
	String name;
	double salary;
	@Override
	public String toString() {
		return "Teacher [exp=" + exp + ", name=" + name + ", salary=" + salary + "]";
	}
	public Teacher(int exp, String name, double salary) {
		super();
		this.exp = exp;
		this.name = name;
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
