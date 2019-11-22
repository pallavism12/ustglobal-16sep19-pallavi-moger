package com.ustglobal.sorting;

import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		Integer peekEle=l.peek();
		System.out.println("peek ele"+peekEle);
		
		Integer peekFirstEle=l.peekFirst();
		System.out.println("peek first ele"+peekFirstEle);
		
		Integer peekLastEle=l.peekLast();
		System.out.println("peek last ele"+peekLastEle);
		
		Integer pollEle=l.poll();
		System.out.println("poll ele"+pollEle);
		
		Integer pollFirstEle=l.pollFirst();
		System.out.println("poll first ele"+pollFirstEle);
		
		Integer pollLastEle=l.pollLast();
		System.out.println("poll last ele"+pollLastEle);
		System.out.println("remaining ele"+l);
		
		l.push(40);
		System.out.println("after push");
		System.out.println(l);
		
		Integer p=l.pop();
		System.out.println(p);
		System.out.println("after pop"+l);
		
		
				
	}
}
