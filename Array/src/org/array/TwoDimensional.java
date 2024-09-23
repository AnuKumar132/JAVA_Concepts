package org.array;

public class TwoDimensional {
    public static void main(String[] args)
                                                                                //  [3][3] MATRIX
//    {
//		int a[][] =new int [2][2];
//		a[0][0]=10;
//		a[0][1]=20;
//		a[1][0]=30;
//		a[1][1]=40;
//	
////		Nested for loop
//		for (int i=0;i<a.length;i++) {
//			for (int j=0;j<a.length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
//		
////		Nested enhanced for loop
//		for (int[] b:a) {
//			for (int c:b) {
//				System.out.println(c);
//			}
//		}
//	}
    
                                                                                //  [3][3] MATRIX
    {
		int a[][] =new int [3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=50;
		a[2][0]=60;
		a[2][1]=70;
		a[2][2]=80;
	
//		Nested for loop
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("------------------------------");
//		Nested enhanced for loop
		for (int[] b:a) {
			for (int c:b) {
				System.out.println(c);
			}
		}
	}
}
