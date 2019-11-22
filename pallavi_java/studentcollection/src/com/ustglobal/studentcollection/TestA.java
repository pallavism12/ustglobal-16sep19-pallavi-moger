package com.ustglobal.studentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(100,"ghg",98.9);
		Student s2=new Student(101,"rtghg",98.9);
		Student s3=new Student(102,"gghghh",98.9);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
		
		System.out.println("***********************");
		for(Student st:al){
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
