package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		Long c1=o1.micr;
		Long c2=o2.micr;
		 return c1.compareTo(c2);
	}
}
