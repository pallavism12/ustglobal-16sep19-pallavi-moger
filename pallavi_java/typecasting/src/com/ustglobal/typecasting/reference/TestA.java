package com.ustglobal.typecasting.reference;

public class TestA {
public static void main(String[] args) {
	Pen p1 =new Pen();
	p1.write();
	//Pen p= new Marker();
	//System.out.println(p.cost);
	//p.write();
	
	Marker m=(Marker)p1;
	m.color();
	m.write();
}
}

