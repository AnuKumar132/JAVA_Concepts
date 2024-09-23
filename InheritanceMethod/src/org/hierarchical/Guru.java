package org.hierarchical;

public class Guru extends Amma {
	private void guru() {
		System.out.println("Guru is working in Bank");
	}
public static void main(String[] args) {
	Guru a= new Guru();
	a.childOne();
	a.guru();
}
}
