package com.ustglobal.beanobject;

public class Mainclass18 {
	public static void main(String[] args) {
		Student18 s=new Student18();
		s.setId(1);
		s.setName("pallu");
		s.setAge(20);
		Database18 d=new Database18();
		d.recieve(s);
	}

}
