package com.ustglobal.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class TestC {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("vinu");
		al.add("vani");
		al.add("vini");
		al.add("veena");
		
		System.out.println("before sort."+al);
		Collections.sort(al);
		System.out.println("after sort.."+al);
		
	}

}
