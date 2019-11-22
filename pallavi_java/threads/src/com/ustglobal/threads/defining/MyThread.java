package com.ustglobal.threads.defining;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread1");
		}
	}
	
//	public void run(int i ) {
//		for(int j=0;j<10;j++) {
//			System.out.println("run(int i) thread1");
//		}
//	}
//	@Override
//	public void start() {
//		System.out.println("start method");
//	}
}
