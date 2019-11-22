package com.ustglobal.studentcollection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestB4 {
	public static void main(String[] args) {
		Stack<Employee> al=new Stack<Employee>();
		Employee s1=new Employee(100,"ghg",98.9);
		Employee s2=new Employee(101,"rtghg",98.9);
		Employee s3=new Employee(102,"gghghh",98.9);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Employee s=al.get(i);
			System.out.println(s.eid);
			System.out.println(s.name);
			System.out.println(s.salary);
		}
		
		System.out.println("***********************");
		for(Employee st:al){
			System.out.println(st);
		}
		System.out.println("***************************");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
			
		}
		
		System.out.println("*********************");
		
		ListIterator lit=al.listIterator();
		while(lit.hasNext()) {
			Object lob=lit.next();
			System.out.println(lob);
			
		}
		
		
		
	}

}
