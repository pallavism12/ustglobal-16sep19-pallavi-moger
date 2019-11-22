
package com.ustglobal.javaexercise;

public class Subclass6 extends Superclass6 {
	String s="subclass...";
//	 public Subclass6(){
//		// super();
//		 System.out.println("subclass constructor");
//		
//	}
	void SubclassMethod(){
		 System.out.println("SubclassMethod()");
		 System.out.println(s);
		 System.out.println(super.s);
	 }

}
