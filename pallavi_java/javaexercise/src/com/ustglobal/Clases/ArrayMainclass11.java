package com.ustglobal.Clases;

public class ArrayMainclass11 {

	static void recieve(int[] numbers) {
		for(int num:numbers) {
			System.out.println(num);
		}
	}
	static	public int[] getArray() {
		int[] values= {20,30,40,50};
		return values;
	}
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		recieve(nums);
		System.out.println("************************");
		int[] res=	getArray();
		for(int i:res) {
			System.out.println(i);
		}
	

	}
}
