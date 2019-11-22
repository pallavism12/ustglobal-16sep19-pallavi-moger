package com.ustglobal.hasarelation.weak;

public class TestC {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println( "name of person :"+p.name);
		p.sleep();
		p.eat();
		p.m.write();
		System.out.println("color of marker: "+p.m.color);



	}
}
