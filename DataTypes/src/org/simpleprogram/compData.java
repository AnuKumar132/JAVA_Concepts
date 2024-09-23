package org.simpleprogram;
//Method Overloading
//1.Same class
//2. Same Method
//3.Different Arguments

//public class compData {
//      public static void main(String[] args) {
//		String name = "Anu Kumar";
////		System.out.println("emp name is "+name);
//		
//		byte age = 20;
////		System.out.println("emp age is "+age);
//		
//		long mobile = 9363243124l;
////		System.out.println("emp mobile is "+mobile);
//		
//		char gender = 'F';
////		System.out.println("emp gender is "+gender);
//		
//		short salary = 30000;
////		System.out.println("emp salary is "+salary);
//		
//		int accNo = 123456789;
////		System.out.println("emp accNo is "+accNo);
//		
//		float p = 2.3f;
////		System.out.println("emp p is "+p);
//		
//		double d= 12.3456789;
////		System.out.println("emp double is "+d);
//		
//		System.out.println("emp name is "+name +"\n"+"emp age is "+age+"\n"+"emp mobile is "+mobile);
//		
//	}
//}

//public class compData {
//   private void empData(String name,int a) {
//	    System.out.println("emp name is "+name +"\n"+"emp age is "+a);
//
//   }
//   private void empData(int a,String name) {
//		System.out.println("emp name is "+name +"\n"+"emp age is "+a);
//		
//	}
//   public static void main(String[] args) {
//	compData a= new compData();
//	a.empData(20,"Anu");
//	a.empData("Saro", 21);
//}
//}

//this -->

//public class compData {
//	   private void empData(String name) {
//		    System.out.println("emp name is "+name );
//		    this.empData(10);
//		    this.empData('m');
//	   }
//	   private void empData(char a) {
//			System.out.println("emp age is "+a);
//			
//		}
//	   private void empData(int a) {
//			System.out.println("emp age is "+a);
//			
//		}
//	   public static void main(String[] args) {
//		compData a= new compData();
//		a.empData("Anu");
//		
//	}
//	}

//Super -->Method calling keyword-->Different class
public class compData extends Employee{
	   private void empData(String name) {
		    System.out.println("emp name is "+name );
		    this.empData(10);
		    this.empData('m');
		    super.empData(2.33f);
	   }
	   private void empData(char a) {
			System.out.println("emp age is "+a);
			
		}
	   private void empData(int a) {
			System.out.println("emp age is "+a);
			
		}
	   public static void main(String[] args) {
		compData a= new compData();
		a.empData("Anu");
		
	}
	}