package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<Employee>();
		Employee e1=new Employee(12,"sweety",7896978);
		Employee e2=new Employee(78,"teju",7126978);
		Employee e3=new Employee(72,"sweety",908878);
		Employee e4=new Employee(98,"sheela",4596978);
		Employee e5=new Employee(98,"sheela",4596978);
		//here it compares the hashcode,but set doesn't allow duplicates,
//		so we have to override hashcode() and equals()

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("******************8");
		Iterator<Employee> it=hs.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);

		}
	}
}
