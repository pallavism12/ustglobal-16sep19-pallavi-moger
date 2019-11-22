package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> hs=new LinkedHashSet<Double>();
		hs.add(778.09);
		hs.add(778.98);
		hs.add(90.08);
		hs.add(874.0);
		hs.add(87.0);
		hs.add(null);
		
		
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println("**********");
	
		Iterator<Double> it=hs.iterator();
		while(it.hasNext()) {
			Double re=it.next();
			System.out.println(re);
		}
}
}
