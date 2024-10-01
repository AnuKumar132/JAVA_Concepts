package org.reverse;

public class ReverseAndPalindrome {
      public static void main(String[] args) {
		String s="MADAM";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a=a+s.charAt(i);
		}
		System.out.println(a);
		if(s.equals(a))
		{
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not a Palindrome");
		}
    	  
    	  
    	String s1="Anu";
  		String a1="";
  		for(int i=s1.length()-1;i>=0;i--) {
  			a1=a1+s1.charAt(i);
  		}
  		System.out.println(a1);
  		if(s1.equals(a1))
  		{
  			System.out.println("This is Palindrome");
  		}
  		else {
  			System.out.println("This is not a Palindrome");
  		}
	}
}
