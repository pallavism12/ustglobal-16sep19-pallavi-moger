package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		
		
		
		Pendrives p=new Pendrives();
		UsbConnect.connect(p);
		
		Mouse m=new Mouse();
		UsbConnect.connect(m);
		
	}

}
