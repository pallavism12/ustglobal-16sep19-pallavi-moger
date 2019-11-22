package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("viji");
		hs.add("hgjg");
		hs.add("hgjg");
		hs.add("jhuy");
		
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println("**********");
	
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			String re=it.next();
			System.out.println(re);
		}
}
}
