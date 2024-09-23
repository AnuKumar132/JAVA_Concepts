package org.task;
 
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
	     Scanner task= new Scanner(System.in);
	     int n = task.nextInt();
	     int a[] =new int[n];
	     for (int i=0;i<n;i++)
	     {
	    	 a[i]=task.nextInt();
	     }
	     int m1=a[0];
	     for(int i=1;i<n;i++)
	     {
	        if(a[i]>m1)
	        {
	            m1=a[i];
	        }
	     }
	     int m2=a[0];
	     for(int i=1;i<n;i++)
	     {  if(a[i]!=m1)
	        {
	            if(a[i]>m2)
	            {
	                m2=a[i];
	            }
	         }
	     }
	     System.out.print(m2);
	     
	}
}
