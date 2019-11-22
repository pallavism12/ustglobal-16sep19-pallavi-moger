package com.ustglobal.Clases;

public class mainclass8 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person8 p=new Person8(10,"pallavi");
		System.out.println(p.id);
		System.out.println(p.name);
		
		System.out.println("*******************");
		
		Object o=p.clone();
		
		Person8 r=(Person8)o;
		System.out.println(r.id);
		System.out.println(r.name);
		r.id=20;
		r.name="pavi";
		
		System.out.println("after cloning");
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(r.id);
		System.out.println(r.name);
	}
}
