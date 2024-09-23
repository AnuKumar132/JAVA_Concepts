package org.base;

public class Employee {
	private void empId() {
		// TODO Auto-generated method stub
       System.out.println("Employee ID is E21CS005");
	}
	private void empName() {
		// TODO Auto-generated method stub
       System.out.println("Employee Name is Anu Kumar");
	}
public static void main(String[] args) {
	Company a = new Company();
	a.companyId();
	a.companyName();
	
	Employee b = new Employee();
	b.empId();
	b.empName();
}
}
