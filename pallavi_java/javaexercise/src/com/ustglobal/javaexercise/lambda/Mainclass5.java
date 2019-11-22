package com.ustglobal.javaexercise.lambda;

public class Mainclass5 implements SquareInterface5 {
	public static void main(String[] args) {
		SquareInterface5 s=(a)->a*a;
		
		int res=s.square(10);
		System.out.println(res);
	}

	@Override
	public int square(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

}
