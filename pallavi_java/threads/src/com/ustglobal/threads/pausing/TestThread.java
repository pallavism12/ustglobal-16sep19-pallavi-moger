package com.ustglobal.threads.pausing;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		MyThread t=new MyThread();
		t.start();
	
		
		for(int j=0;j<10;j++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}
}
