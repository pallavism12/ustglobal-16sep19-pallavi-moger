package com.ustglobal.Clases;

public class RemoteMainclass7 {
	public void add() {
		System.out.println("add method");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		RemoteMainclass7 r=new RemoteMainclass7();
		Class c=r.getClass();
		System.out.println("class:  "+c);
		
		Object o=c.newInstance();
		
		RemoteMainclass7 q=(RemoteMainclass7)o;
		q.add();
		System.out.println(q);
		}
	
}
