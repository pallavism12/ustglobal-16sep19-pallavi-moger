package com.ustglobal.javaexercise.lambda;

public  class Mainclass2 implements MultiplyInterface2 {
	 public static void main(String[] args) {
		 
		 MultiplyInterface2 m=(a,b)->a*b;
		 int res= m.multiply(10,20);
		 System.out.println(res);
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
