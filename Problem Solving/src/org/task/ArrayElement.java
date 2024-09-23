package org.task;

import java.util.Scanner;

public class ArrayElement {
	public static void main(String[] args) {
	
     Scanner task= new Scanner(System.in);
     int n = task.nextInt();
     int a[] =new int[n];
     for (int i=0;i<n;i++)
     {
    	 a[i]=task.nextInt();
     }
     int m=a[0];
     for(int i=1;i<n;i++)
     {
        if(a[i]>m)
        {
            m=a[i];
        }
     }
     System.out.print(m);
     
}
}
