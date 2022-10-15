package com.warrior.comparator.downcastingexam;

import java.util.Comparator;

public class StudentCity implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int res1=((Student)o1).city.compareTo(((Student)o2).city);
		return res1;
	}

}
