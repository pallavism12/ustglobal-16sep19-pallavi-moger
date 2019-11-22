package com.ustglobal.beanobject;

public class TestD {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(100);
		e.setSalary(10000);
		e.setName("kavitha");
		e.setDept("cs");
		e.setDesignation("developer");
		
		Database2 db=new Database2();
		db.show(e);
	}
	

}
