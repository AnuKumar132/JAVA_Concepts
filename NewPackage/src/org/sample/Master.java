package org.sample;

import org.base.Company;

public class Master {
     private void masterId() {
		System.out.println("Master ID is 123149867");

	}
     private void masterName() {
		System.out.println("Master Name is Beta");

	}
public static void main(String[] args) {
	Master a = new Master();
	a.masterId();
	a.masterName();
	
	Company b = new Company();
	b.companyId();
	b.companyName();
}
}
