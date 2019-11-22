package com.ustglobal.threads.pausing;

public class TestJoin {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyJoinThread t=new MyJoinThread();
		t.start();
		try {
			
			t.join(10000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		for(int j=0;j<10;j++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}
}
