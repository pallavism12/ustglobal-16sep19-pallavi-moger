package com.ustglobal.sorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestD  {
	public static void main(String[] args) {
		LinkedList<Laptop> l1=new LinkedList<Laptop>();
		Laptop lp1=new Laptop(25000,4,"hp");
		Laptop lp2=new Laptop(40000,5,"hp");
		Laptop lp3=new Laptop(29000,8,"hp");
		Laptop lp4=new Laptop(24000,6,"hp");
		l1.add(lp1);
		l1.add(lp2);
		l1.add(lp3);
		l1.add(lp4);
		System.out.println("before sorting");
		displayLaptop(l1);
		Collections.sort(l1);
		System.out.println("after sorting");
		displayLaptop(l1);
		
	}
	static void displayLaptop(LinkedList<Laptop> l) {
		Iterator<Laptop> it=l.iterator();
		while(it.hasNext()) {
			Laptop lp=it.next();
			System.out.println("brand is"+lp.name);
			System.out.println("price is"+lp.price);
			System.out.println("ram is"+lp.ram);
		}
	}
}
