package com.warrior.comparator.downcastingexam;

import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		Student s1 = new Student(10, "vaibhav", "washim");
		Student s3 = new Student(25, "pranav", "kolhapur");
		Student s4 = new Student(12, "vishwajeet", "pune");
		Student s2 = new Student(9, "marish", "raygad");
		Student s5 = new Student(24, "mukund", "jalna");
		TreeSet ts = new TreeSet(new StudentName());
		ts.add(s5);
		ts.add(s3);
		ts.add(s2);
		ts.add(s4);
		ts.add(s1);
		System.out.println(ts);
		
		TreeSet ts2 = new TreeSet(new StudentRollNo());
		ts2.add(s5);
		ts2.add(s3);
		ts2.add(s2);
		ts2.add(s4);
		ts2.add(s1);
		System.out.println(ts2);
		

		TreeSet ts3 = new TreeSet(new StudentCity());
		ts3.add(s5);
		ts3.add(s3);
		ts3.add(s2);
		ts3.add(s4);
		ts3.add(s1);
		
		System.out.println(ts3);

	}

}
