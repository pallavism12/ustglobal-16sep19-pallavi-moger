package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("viji");
		hs.add("hgjg");
		hs.add("hgjg");
		hs.add("jhuy");
		hs.add(87);
		hs.add(null);
		
		
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
