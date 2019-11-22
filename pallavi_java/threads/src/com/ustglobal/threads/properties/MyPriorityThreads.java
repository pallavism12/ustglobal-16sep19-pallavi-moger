package com.ustglobal.threads.properties;

public class MyPriorityThreads extends Thread {
	public static void main(String[] args) {

		System.out.println("main started");

		int p=Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		
		Thread.currentThread().setPriority(7);
		System.out.println("main thread changed priority "+Thread.currentThread().getPriority());

		MyPriorityThreads m=new MyPriorityThreads();
		int q=m.getPriority();
		System.out.println("MyPriorityThreads priority "+q);
		
		m.setPriority(6);
		System.out.println("changed MyPriorityThreads priority "+m.getPriority() );

		System.out.println("main ended");
	}
}
