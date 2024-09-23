package org.phone;

public class InternalStorage {
    private void processorName() {
		System.out.println("My phone processor name is Qualcomm Snapdragon");

	}
    private void ramSize() {
		System.out.println("My phone RAM size is");

	}
public static void main(String[] args) {
	InternalStorage a= new InternalStorage();
	a.processorName();
	a.ramSize();
	
	ExternalStorage b= new ExternalStorage();
	b.size();
}
}
