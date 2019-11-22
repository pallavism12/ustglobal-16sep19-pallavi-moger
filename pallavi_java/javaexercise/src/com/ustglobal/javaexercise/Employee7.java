package com.ustglobal.javaexercise;

public class Employee7 {
	int id;
	String name;

	public Employee7(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id);
		display2();
		
	}
	void display2() {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Employee7 e=new Employee7(10,"aaru");
		e.display();
		
		Employee7 e1=new Employee7(20,"paaru");
		e1.display();
		
		Employee7 e2=new Employee7(30,"veda");
		e2.display();
		
	}
}