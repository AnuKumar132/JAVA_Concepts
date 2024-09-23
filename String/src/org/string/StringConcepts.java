package org.string;

public class StringConcepts {
     public static void main(String[] args) {
    	 
		String a = "Programming Language";
		
		char charAt = a.charAt(3);
		System.out.println(charAt);
		
		int indexOf = a.indexOf("L");
		System.out.println(indexOf);
		
	    int lastIndexOf = a.lastIndexOf("a");
	    System.out.println(lastIndexOf);
	    
	    int length = a.length();
	    System.out.println(length);
	    
	    boolean empty = a.isEmpty();
	    System.out.println(empty);
	    
	    boolean contains = a.contains("g");
	    System.out.println(contains);
	    
//	    String trim = a.trim();
//	    System.out.println(trim);
	    
	    boolean startsWith = a.startsWith("pr");
	    System.out.println(startsWith);
	    
	    boolean endsWith = a.endsWith("ge");
	    System.out.println(endsWith);
	    
	    String upperCase = a.toUpperCase();
	    System.out.println(upperCase);
	    
	    String lowerCase = a.toLowerCase();
	    System.out.println(lowerCase);
	    
	    String b= "Anu";
	    String c="Kavi";
	    boolean equals = b.equals(c);
	    System.out.println(equals);
	    
	    String d= "Anu";
	    String e= "ANU";
	    boolean equalsIgnoreCase = d.equalsIgnoreCase(e);
	    System.out.println(equalsIgnoreCase);
	    
	    String replace = a.replace("Programming", "Program");
	    System.out.println(replace);
	    
	    String replaceAll = a.replaceAll("Programming Language", "PROGRAMMING LANGUAGE");
	    System.out.println(replaceAll);
	    
	    String substring = a.substring(1);
	    System.out.println(substring);
	    
	    String substring2 = a.substring(1,13);
	    System.out.println(substring2);
	    
	    int compareTo = b.compareTo(c);
	    System.out.println(compareTo);
	    
//	    OR
	    
	    int compareTo2 = c.compareTo(b);
	    System.out.println(compareTo2);
	}
     
}
