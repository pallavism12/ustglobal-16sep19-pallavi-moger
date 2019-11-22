package com.ustglobal.javaexrecise.exception;

import java.io.IOException;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("main starded");
		
		FileTest12 ft=new FileTest12();
		try {
			ft.open();
		}catch(ClassNotFoundException e ) {
			e.printStackTrace();
			System.out.println("exception caught");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		
	}
}
