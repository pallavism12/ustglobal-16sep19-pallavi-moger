package com.ustglobal.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Marker> al=new ArrayList<Marker>();
		al.add(new Marker(30,"blue"));
		al.add(new Marker(40,"green"));
		al.add(new Marker(50,"blue"));
		al.add(new Marker(60,"blue"));

		System.out.println("before sorting    ");
		display(al);

//		SortByprice sb=new SortByprice();
		SortByColor sc=new SortByColor();

//		Collections.sort(al,sb);
		Collections.sort(al,sc);

		System.out.println("after sorting");
		display(al);
	}

	public static void display(ArrayList<Marker> p) {
		Iterator<Marker> it=p.iterator();
		while(it.hasNext()) {
			Marker res=it.next();
			System.out.println(res.price);
			System.out.println(res.color);
		}
	}






}


