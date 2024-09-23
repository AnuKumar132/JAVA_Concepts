package org.task;

import java.util.Scanner;

//public class Task3 {
//	public static void main(String[] args) {
//		
//	     Scanner task= new Scanner(System.in);
//	     int rs= task.nextInt();
//	     int cs= task.nextInt();
//	     int a[][] =new int[rs][cs];
//	     for (int i=0;i<rs;i++)
//	     {
//	    	 for(int j=0;j<cs;j++) {
//	    		 a[i][j]=task.nextInt();
//	    	 }
//	     }
//	     int fd=0;
//	     for(int i=0;i<rs;i++)
//	     {
//	         for(int j=0;j<cs;j++)
//	         {  if(i==j)
//	            {
//	                fd=fd+a[i][j];
//	            }
//	         }
//	     }
//	     System.out.print("FD="+fd);
//	     
//	}
//}


//Backward dignal

//public class Task3 {
//	public static void main(String[] args) {
//		
//	     Scanner task= new Scanner(System.in);
//	     int rs= task.nextInt();
//	     int cs= task.nextInt();
//	     int a[][] =new int[rs][cs];
//	     for (int i=0;i<rs;i++)
//	     {
//	    	 for(int j=0;j<cs;j++) {
//	    		 a[i][j]=task.nextInt();
//	    	 }
//	     }
//	     int bd=0;
//	     for(int i=0;i<rs;i++)
//	     {
//	         for(int j=0;j<cs;j++)
//	         {  if(i==cs-1-j)
//	            {
//	                bd=bd+a[i][j];
//	            }
//	         }
//	     }
//	     System.out.print("BD="+bd);
//	     
//	}
//}


//Forward and Backward Diagonal

public class Task3 {
	public static void main(String[] args) {
		
	     Scanner task= new Scanner(System.in);
	     int rs= task.nextInt();
	     int cs= task.nextInt();
	     int a[][] =new int[rs][cs];
	     for (int i=0;i<rs;i++)
	     {
	    	 for(int j=0;j<cs;j++) {
	    		 a[i][j]=task.nextInt();
	    	 }
	     }
	     int fd=0;
	     for(int i=0;i<rs;i++)
	     {
	         for(int j=0;j<cs;j++)
	         {  if(i==j)
	            {
	                fd=fd+a[i][j];
	            }
	         }
	     }
	     System.out.print("FD="+fd);
	     System.out.println();
	     int bd=0;
	     for(int i=0;i<rs;i++)
	     {
	         for(int j=0;j<cs;j++)
	         {  if(i==cs-1-j)
	            {
	                bd=bd+a[i][j];
	            }
	         }
	     }
	     System.out.print("BD="+bd);
	     System.out.println();
	}
}
