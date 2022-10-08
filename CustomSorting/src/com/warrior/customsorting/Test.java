package com.warrior.customsorting;

import java.util.TreeSet;


public class Test {
public static void main(String[] args) {
	
	
	Employee e1=new Employee(10,"abc","pune");
	Employee e2=new Employee(1,"xyz","mumbai");
	Employee e3=new Employee(8,"pqr","nagpur");
	
	TreeSet ts=new TreeSet(new EmployeeIdComparator());
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	System.out.println("Sorting order of employee id: "+ts);
	
	
	TreeSet ts1=new TreeSet(new EmployeeNameComparator());
	ts1.add(e1);
	ts1.add(e2);
	ts1.add(e3);
	System.out.println("Sorting order of Employee name: "+ts1);
	
	
	TreeSet ts2=new TreeSet(new EmployeeCityComparator());
	ts2.add(e1);
	ts2.add(e2);
	ts2.add(e3);
	System.out.println("Sorting order of employee city: "+ts2);
}
}
