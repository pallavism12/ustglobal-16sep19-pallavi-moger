package com.ustglobal.javaexercise.lambda;

public class Mainclass1 implements AddInterface1{
	public static void main(String[] args) {
		 Mainclass1  m=new Mainclass1();
		 int sum=m.add(10, 20);
		 System.out.println(sum);
		 
		 System.out.println("****************");
		 
		 AddInterface1 c=(a,b)->a+b;
		 
		 int res=c.add(10, 20);
		 System.out.println(res);
				 
		
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
