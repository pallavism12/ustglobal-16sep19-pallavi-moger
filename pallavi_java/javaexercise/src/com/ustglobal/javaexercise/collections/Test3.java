package com.ustglobal.javaexercise.collections;
import java.util.ArrayList;
public class Test3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("pavi");
		Object o=al.get(0);
		System.out.println(o);

		String name=(String)o;
		String	name2=name.toUpperCase();
		//String name3=((String) o).toUpperCase();
		
		System.out.println(name);
		System.out.println(name2);

	}

}
