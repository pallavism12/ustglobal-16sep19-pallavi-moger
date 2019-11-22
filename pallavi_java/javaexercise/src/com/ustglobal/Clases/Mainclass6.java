package com.ustglobal.Clases;

public class Mainclass6 {
	public static void main(String[] args) {
		Employee6 e1=new Employee6(10 , "pallavi", 30000);
		Employee6 e2=new Employee6(20 , "pavi", 40000);
		Employee6 e3=new Employee6(10 , "pallavi", 30000);
		Employee6 e4=new Employee6(10 , "pallavi", 30000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		
	}
}
