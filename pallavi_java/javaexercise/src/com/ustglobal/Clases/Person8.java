package com.ustglobal.Clases;

public class Person8 implements Cloneable{
	int id;
	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	public Person8(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	

}
