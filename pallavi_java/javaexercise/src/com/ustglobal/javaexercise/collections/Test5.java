package com.ustglobal.javaexercise.collections;
import java.util.ArrayList;
public class Test5 {
	public static void main(String[] args) {
		
		ArrayList<Student5> a=new ArrayList<>();
		Student5 s1=new Student5(1,"pallavi",87);
		Student5 s2=new Student5(2,"sahana",57);
		Student5 s3=new Student5(3,"ammu",90);
		Student5 s4=new Student5(4,"pavi",78);
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		for(Student5 s:a) {
			
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
		}
	}

}
