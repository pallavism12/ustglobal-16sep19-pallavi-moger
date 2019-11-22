package com.ustglobal.collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<>();
		li.add(12);
		li.add(89);
		li.add(76);
		li.add(87);
		li.add(45);
		li.add(45);
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println("after sorting"+li);
		
		Collections.reverse(li);
		System.out.println("after reversing+"+li);
		
		Collections.shuffle(li);
		System.out.println("after shuffle"+li);
	}
}
