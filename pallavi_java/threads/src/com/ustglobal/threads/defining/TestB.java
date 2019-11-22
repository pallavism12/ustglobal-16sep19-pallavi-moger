package com.ustglobal.threads.defining;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyRunnable r=new MyRunnable();
		//r.start(); start is undefined in Runnable
		Thread t1=new Thread(r);
		t1.start();
		
		for(int j=0;j<10;j++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}
}
