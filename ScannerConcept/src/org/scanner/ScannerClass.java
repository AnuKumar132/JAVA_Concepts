package org.scanner;

import java.util.Scanner;

public class ScannerClass {
     public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		String nextLine = a.nextLine();
		System.out.println(nextLine);
		
		String next = a.next();
		System.out.println(next);
		
		int nextInt = a.nextInt();
		System.out.println(nextInt);
		
		byte nextByte = a.nextByte();
		System.out.println(nextByte);
		
		short nextShort = a.nextShort();
		System.out.println(nextShort);
		
		float nextFloat = a.nextFloat();
		System.out.println(nextFloat);
		
		long nextLong = a.nextLong();
		System.out.println(nextLong);
		
		boolean nextBoolean = a.nextBoolean();
		System.out.println(nextBoolean);
		
		double nextDouble = a.nextDouble();
		System.out.println(nextDouble);
	}
}
