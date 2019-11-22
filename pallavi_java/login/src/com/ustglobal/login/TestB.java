package com.ustglobal.login;

public class TestB {
	public static void main(String[] args) {
		Browser b=new Browser();
		
		Google gl=new Gmail();
		b.open(gl);
		
		Google gl2=new GoogleDrive();
		b.open(gl2);
	}
}