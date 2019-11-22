package com.ustglobal.threads.properties;

public class MyIdThread extends Thread{
		public static void main(String[] args) {
			
			System.out.println("main started");
			
			System.out.println(Thread.currentThread().getId());
			
			
			MyIdThread m=new MyIdThread();
			System.out.println("my id thread "+m.getId());
			
			//m.setId(9);we cannot set the id
			
			System.out.println(Thread.currentThread().getPriority());
			Thread.currentThread().setPriority(11);//exception
	
			
			System.out.println("main ended");
		}

}
