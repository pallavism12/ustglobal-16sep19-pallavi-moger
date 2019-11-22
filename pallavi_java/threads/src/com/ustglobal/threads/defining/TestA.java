package com.ustglobal.threads.defining;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread t1=new MyThread();
		t1.start();
		//t1.start();
		
		
		for(int j=0;j<10;j++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}

}
