package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {
	@Override
	public int compare(Bank b1, Bank b2) {
		Integer a1=b1.pincode;
		Integer a2=b2.pincode;
		 return a1.compareTo(a2);
	}
}
