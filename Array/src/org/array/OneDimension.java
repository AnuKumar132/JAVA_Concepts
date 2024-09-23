package org.array;

public class OneDimension {
   public static void main(String[] args) {
	int a[]=new int [6];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
//	For loop
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("-----------------------------");
	
//	Enhanced for loop
	for (int b:a) {
		System.out.println(b);
	}
}
}
