package com.ustglobal.Clases;

public class Mainclass5 {
	public static void main(String[] args) {
		Cow5 c1=new Cow5(10,"gowri",10000);
		Cow5 c2=new Cow5(20,"mangala",20000);
		Cow5 c3=new Cow5(10,"gowri",10000);
		
		boolean res=c1.equals(c2);
		System.out.println(res);
		
		boolean res2=c1.equals(c3);
		System.out.println(res2);
		
	}

}
