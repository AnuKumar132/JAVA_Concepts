package org.reverse;

public class SumofNumbers {
    public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int s=0;
		for (int i=0;i<a.length;i++) {
			s=s+a[i];
		}
		System.out.println("Sum of array is "+s);
		System.out.println("Average of Array is "+s/a.length);
	}
}
