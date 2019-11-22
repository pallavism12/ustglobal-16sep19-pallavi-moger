package com.ustglobal.javaexercise.collections;
import java.util.ArrayList;
public class Test1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(12);
		al.add(null);
		al.add(null);
		al.add(12);
		al.add("abc");
		al.add("hgjf");
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			System.out.println(obj);
			}
		
		System.out.println("****************");
		
		for(Object j:al) {
			System.out.println(j);
		}
	}

}
