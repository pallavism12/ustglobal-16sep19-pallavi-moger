package com.ustglobal.threads.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname=Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		//creating our own thread.
		MyThread t1=new MyThread();
		String mname=t1.getName();
		System.out.println("MyThread name "+mname);
		
		t1.setName("golu");
		System.out.println("Changed MyThread Name "+t1.getName());
		
		Thread.currentThread().setName("bala");
		
		
		System.out.println(10/0);
		
		System.out.println("main ended");
	}
	
}
