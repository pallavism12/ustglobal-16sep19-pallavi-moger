package com.ustglobal.javaexercise.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test4 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(78);
		l.add("ryu");
		l.add("ryu");
		l.add(null);
		l.add(null);

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

		System.out.println("**********************");

		for(Object o:l) {
			System.out.println(o);
		}
		System.out.println("************************");	
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
		}
		System.out.println("**************************************");
		
		ListIterator lit=l.listIterator();
		while(lit.hasPrevious()) {
			Object obj2=lit.previous();
			System.out.println(obj2);
		}



	}
}