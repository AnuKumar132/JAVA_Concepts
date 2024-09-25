package org.collection;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethod {
      public static void main(String[] args) {
//    HashSet
    	  System.out.println("-------------HashSet--------------");
		Set <Object> s =new HashSet<>();
		s.add(10);
		s.add(true);
		s.add("Anu");
		s.add(55.3333f);
		s.add(10000000000l);
		
		for(Object s1:s) {
			System.out.println(s1);
		}
//	LinkedHashSet	
		System.out.println("---------LinkedHashSet-------------");
		
		Set <Object> s2 =new LinkedHashSet<>();
		s2.add(10);
		s2.add(true);
		s2.add("Anu");
		s2.add(55.3333f);
		s2.add(10000000000l);
		
		for (Object s3:s2) {
			System.out.println(s3);
		}
//	TreeSet
		System.out.println("------------TreeSet---------------");
		Set <Object> s4=new TreeSet<>();
		s4.add(10);
		s4.add(30);
		s4.add(55);
		s4.add(100);
		s4.add(20);
		
		for (Object s5:s4) {
			System.out.println(s5);
		}
		
	}
}
