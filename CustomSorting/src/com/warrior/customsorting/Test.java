package com.warrior.customsorting;

import java.util.TreeSet;

import com.warrior.customsorting.Employee.EmployeeCityComparator;
import com.warrior.customsorting.Employee.EmployeeIdComparator;
import com.warrior.customsorting.Employee.EmployeeNameComparator;

public class Test {
public static void main(String[] args) {
	
	
	Employee e1=new Employee(10,"abc","pune");
	Employee e2=new Employee(1,"xyz","mumbai");
	Employee e3=new Employee(8,"pqr","nagpur");
	EmployeeIdComparator eic=e1.new EmployeeIdComparator();
	TreeSet ts=new TreeSet(eic);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	System.out.println("Sorting order of employee id: "+ts);
	
	EmployeeNameComparator enc=e1.new EmployeeNameComparator();
	TreeSet ts1=new TreeSet<>(enc);
	ts1.add(e1);
	ts1.add(e2);
	ts1.add(e3);
	System.out.println("Sorting order of Employee name: "+ts1);
	
	EmployeeCityComparator ecc=e1.new EmployeeCityComparator();
	TreeSet ts2=new TreeSet<>(ecc);
	ts2.add(e1);
	ts2.add(e2);
	ts2.add(e3);
	System.out.println("Sorting order of employee city: "+ts2);
}
}
