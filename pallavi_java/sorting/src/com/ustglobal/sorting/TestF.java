package com.ustglobal.sorting;

import java.util.Stack;

public class TestF {
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.add(19);
		s.add(30);
		s.push(40);
		
		System.out.println("using get()...");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		int j=s.size();
		System.out.println("using pop()...");
		for(int i=0;i<j;i++) {
			System.out.println(s.pop());
		}
	}
}
