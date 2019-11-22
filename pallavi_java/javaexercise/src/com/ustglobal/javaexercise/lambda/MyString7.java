package com.ustglobal.javaexercise.lambda;
//immutable class
public final class MyString7 { 
	private final int rollno;
	private final String name;
	public MyString7(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public   MyString7 changecontent(int rollno,String name) {
		MyString7 m=new MyString7(rollno,name);
		return m;
	}
	
	
	
}
