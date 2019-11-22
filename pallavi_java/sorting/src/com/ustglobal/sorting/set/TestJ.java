package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		TreeSet<Customer> hs=new TreeSet<Customer>();
		Customer e1=new Customer(12,"sweety",7896978);
		Customer e2=new Customer(78,"teju",7126978);
		Customer e3=new Customer(72,"sweety",908878);
		Customer e4=new Customer(98,"sheela",4596978);
		Customer e5=new Customer(98,"sheela",4596978);
		//here it compares the hashcode,but set doesn't allow duplicates,
//		so we have to override hashcode() and equals()

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("******************8");
		Iterator<Customer> it=hs.iterator();
		while(it.hasNext()) {
			Customer e=it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);

		}
	}
}
