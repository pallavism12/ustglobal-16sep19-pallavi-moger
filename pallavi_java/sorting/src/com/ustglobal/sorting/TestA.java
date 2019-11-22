package com.ustglobal.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(109,"dimple",78.0);
		Student s2=new Student(101,"saarika",68.0);
		Student s3=new Student(100,"arvika",90.0);
		Student s4=new Student(103,"ananya",56.0);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("before sorting"+al);
		display(al);
		Collections.sort(al);
		System.out.println("after soting"+al);
		display(al);
		}
	 static void  display(ArrayList<Student> al) {
		
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("id is:"+s.id);
			System.out.println("name is:"+s.name);
			System.out.println("percentage is:"+s.percentage);
		}
	}
}
