package com.ustglobal.javaexercise.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(12);
		al.add(null);
		al.add(null);
		al.add(12);
		al.add("abc");
		al.add("hgjf");
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			System.out.println(obj);
			}
		
		System.out.println("****************");
		
		ListIterator it=al.listIterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
			
		}
		
		System.out.println("******************");
		while(it.hasPrevious()) {
			Object ob=it.previous();
			System.out.println(ob);
			
		}
	}

}
