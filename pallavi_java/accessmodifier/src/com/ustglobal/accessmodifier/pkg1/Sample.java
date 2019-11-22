package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo  {
	public static void main(String[] args) {
		Demo d1=new Demo();


		Sample s=new Sample();
		System.out.println(s.d);
		s.mul();
	}

}
