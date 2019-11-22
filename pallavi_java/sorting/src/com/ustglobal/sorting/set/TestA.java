package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add(90);
		hs.add(89);
		hs.add(null);
		hs.add(null);
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println("****************");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Object res=it.next();
			System.out.println(res);
		}
	}

}
