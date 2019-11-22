package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
		
		
		
//		hs.add(null);
	hs.add(67);
	hs.add(55);
	hs.add(32);
	hs.add(90);
		
		
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println("**********");
	
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Object re=it.next();
			System.out.println(re);
		}
}
}
