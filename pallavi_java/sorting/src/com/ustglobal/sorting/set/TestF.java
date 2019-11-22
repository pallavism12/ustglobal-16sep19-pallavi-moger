package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String>hs=new TreeSet<String>();
		
//		hs.add(null);
	hs.add("deepika");
	hs.add("arpitha");
	hs.add("devika");
	hs.add("karthika");
		
		
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
