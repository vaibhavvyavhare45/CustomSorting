 package com.warrior.customsorting;

import java.util.Comparator;
public class Employee {
int id;
String name;
String city;
public Employee() {
	super();
}
public Employee(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", City=" + city + "]";
}
}
 class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee id1, Employee id2) {
		// TODO Auto-generated method stub
		if(id1.id==id2.id) 
			return 0;
		else if (id1.id>id2.id)
			return 1;
		else 
			return-1;
					
	}
	
}
class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee nm1,Employee nm2) {
		// TODO Auto-generated method stub
		return nm1.name.compareTo(nm2.name);
	}
	
}
class EmployeeCityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee c1,Employee c2) {
		// TODO Auto-generated method stub
		return c1.city.compareTo(c2.city);
	}
	
}


	

