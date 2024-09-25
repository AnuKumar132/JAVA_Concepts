package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
     public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(true);
		li.add(null);
		li.add("Anu");
		li.add(55.56);
		li.add(23.123f);
		li.add(10);
		
		System.out.println(li);
		System.out.println("-------------------------");
		
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("-------------------------");
			
		Object object = li.get(4);
		System.out.println(object);
		
		Object object2 = li.get(3);
		System.out.println(object2);
		
		
//		for each value
		
		List <Object> li1 =new ArrayList<>();
		li1.add(10);
		li1.add(true);
		li1.add(null);
		li1.add("Anu");
		li1.add(55.56);
		li1.add(23.123f);
		li1.add(10);
		
		System.out.println("---------------------------");
		
		for(Object li2:li1) {
			System.out.println(li2);
		}
	}
}
