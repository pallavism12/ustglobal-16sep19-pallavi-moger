package com.ustglobal.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(34.5);
		al.add(23.4);
		al.add(87.8);
		al.add(56.9);
		al.add(89.0);
		al.add(34.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.add(2,10.0);
		System.out.println("after adding 10.0 in index 2"+al);
		
		al.remove(0);
		System.out.println("after removing 0th index"+al);
		
		Double val=al.get(4);
		System.out.println("after getting index 4"+al);
		
		al.set(2, 20.0);
		System.out.println("after setting 20.0 in 2 index"+al);
		
		al.clear();
		System.out.println("after clearing"+al);
		
		al.contains(89.0);
		
		List<Double> al1=new ArrayList<>();
		al1.add(12.3);
		al1.add(78.0);
		al1.add(78.0);
		
		al.addAll(al1);
		System.out.println("after add all "+al);
		
		boolean contain=al.containsAll(al1);
		System.out.println("contains all of al1"+contain);
		
		boolean res=al.removeAll(al1);
		System.out.println("remove of all"+res);
	}

}
