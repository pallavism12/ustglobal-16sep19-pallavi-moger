package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
//		SortByName sb=new SortByName();
//		SortByPincode sp=new SortByPincode();
		SortByMicr sm=new SortByMicr();
		TreeSet<Bank> ts=new TreeSet<Bank>(sm);
		Bank b1=new Bank("HDFC",575890,896789);
		Bank b2=new Bank("SBI",571401,758439);
		Bank b3=new Bank("CITI",576228,655780);
		Bank b4=new Bank("CANARA",576330,657849);
		Bank b5=new Bank("CANARA",576330,657849);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		Iterator<Bank> it=ts.iterator();
		while(it.hasNext()) {
			Bank e=it.next();
			System.out.println(e.name);
			System.out.println(e.pincode);
			System.out.println(e.micr);

		}
		
		
	}
}
