package com.warrior.comparator.downcastingexam;

import java.util.Comparator;

public class StudentName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int res=((Student)o1).name.compareTo(((Student)o2).name);
		return res;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		int res=-((Student)o1).name.compareTo(((Student)o2).name);
//		return res;
//	}

	
	
	

}
