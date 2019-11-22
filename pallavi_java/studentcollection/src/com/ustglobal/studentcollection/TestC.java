package com.ustglobal.studentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Teacher> al=new ArrayList<Teacher>();
		Teacher s1=new Teacher(10,"ghg",98.9);
		Teacher s2=new Teacher(11,"rtghg",98.9);
		Teacher s3=new Teacher(12,"gghghh",98.9);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Teacher s=al.get(i);
			System.out.println(s.exp);
			System.out.println(s.name);
			System.out.println(s.salary);
		}
		
		System.out.println("***********************");
		for(Teacher st:al){
			System.out.println(st);
		}
		System.out.println("***************************");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
			
		}
		
		System.out.println("*********************");
		
		ListIterator lit=al.listIterator();
		while(lit.hasNext()) {
			Object lob=lit.next();
			System.out.println(lob);
			
		}
		
		
		
	}

}

	