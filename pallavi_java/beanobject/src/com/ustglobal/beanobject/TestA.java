package com.ustglobal.beanobject;

public class TestA {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(89);
		s.setName("AVFAH");
		s.setRollno(8778);
		
		Database d=new Database();
				d.receive(s);
				
				
				
		
		
		
		
	}
}
