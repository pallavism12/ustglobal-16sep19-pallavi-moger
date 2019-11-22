package com.ustglobal.javaexercise.lambda;

public class Mainclass4 implements FactorialInterface4{
	public static void main(String[] args) {
		FactorialInterface4 j=(n)->{
			int f=1;
			for(int i=2;i<=n;i++) {
				f=f*i;
			}
			return f;


		};
		int res=j.fact(5);
		System.out.println(res);
	}



	@Override
	public int fact(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
