package org.inheritance;
//Child
public class Employee extends Staff {
     private void empId() {
		System.out.println("Employee ID is 12345");
	}
     private void empName() {
		System.out.println("Employee Name is Anu");
	}
public static void main(String[] args) {
	Employee a= new Employee();
	a.empId();
	a.empName();
	a.companyId();
	a.companyName();
	a.staffId();
	a.staffName();
}
}
