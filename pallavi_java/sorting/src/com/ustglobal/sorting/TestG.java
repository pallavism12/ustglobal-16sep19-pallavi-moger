package com.ustglobal.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Pen> a=new ArrayList<Pen>();
		Pen p1=new Pen(10,"cello","gfhfh");
		Pen p2=new Pen(15,"faster","hdgfhjd");
		Pen p3=new Pen(20,"hgjf","hghghg");
		Pen p4=new Pen(10,"writo meter","fghh");
		
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		displayPen(a);
	}
	
	public static void displayPen(ArrayList<Pen> q) {
		Iterator<Pen> it=q.iterator();
		while(it.hasNext()) {
			Pen p=it.next();
			System.out.println("price is"+p.price);
			System.out.println("brand is"+p.brand);
			
			
		}
	}
}
