package org.map;

import java.util.*;
import java.util.Map.Entry;

public class MapConcept {
      public static void main(String[] args) {
    	  
//    	  HashMap
    	  
    	  System.out.println("-------------HashMap-------------");
		  Map<String,Integer> m= new HashMap();
		  m.put("CSK", 9);
		  m.put("KKR", 4);
		  m.put("MI", 6);
		  m.put("SRK", 7);
		  m.put("RR", 8);
		  m.put("DD", null);
		  m.put("RCB", 5);
		  m.put(null, null);
		  
		  System.out.println(m);
		  
		  int size = m.size();
		  System.out.println(size);
		  
		  boolean containsKey = m.containsKey("CSK");
		  System.out.println(containsKey);
		  
		  boolean containsValue = m.containsValue(9);
		  System.out.println(containsValue);
		  
		  Integer remove = m.remove("CSK");
		  System.out.println(remove);
		  System.out.println(m);
		  
		  Set<String> keySet = m.keySet();
		  System.out.println(keySet);
		  
		  Collection<Integer> values = m.values();
		  System.out.println(values);
		  
		  Set<Entry<String, Integer>> entrySet = m.entrySet();
		  for (Entry<String, Integer> n:entrySet) {
			  System.out.println(n);
			  
//			  String key = n.getKey();
//			  System.out.println(key);
			  
			  System.out.println(n.getKey());
			  
			  System.out.println(n .getValue());
		  }
		  
		  
//		  LinkedHashMap
		  
		  System.out.println("------------LinkedHashMap-----------");
		  Map<String,Integer> m1= new LinkedHashMap();
		  m1.put("CSK", 9);
		  m1.put("KKR", 4);
		  m1.put("MI", 6);
		  m1.put("SRK", 7);
		  m1.put("RR", 8);
		  m1.put("DD", null);
		  m1.put("RCB", 5);
		  m1.put(null, null);
		  
		  System.out.println(m1);
		  
		  int size1 = m1.size();
		  System.out.println(size1);
		  
		  boolean containsKey1 = m1.containsKey("CSK");
		  System.out.println(containsKey1);
		  
		  boolean containsValue1 = m1.containsValue(9);
		  System.out.println(containsValue1);
		  
		  Integer remove1 = m1.remove("CSK");
		  System.out.println(remove1);
		  System.out.println(m);
		  
		  Set<String> keySet1 = m1.keySet();
		  System.out.println(keySet1);
		  
		  Collection<Integer> values1 = m1.values();
		  System.out.println(values1);
		  
		  Set<Entry<String, Integer>> entrySet1 = m1.entrySet();
		  for (Entry<String, Integer> n1:entrySet1) {
			  System.out.println(n1);
			  
//			  String key1 = n1.getKey();
//			  System.out.println(key1);
			  
			  System.out.println(n1.getKey());
			  
			  System.out.println(n1 .getValue());
		  }
		  
//		  TreeMap
		  
		  System.out.println("------------TreeMap-----------");
		  Map<String,Integer> m2= new TreeMap();
		  m2.put("CSK", 9);
		  m2.put("KKR", 4);
		  m2.put("MI", 6);
		  m2.put("SRK", 7);
		  m2.put("RR", 8);
		  m2.put("DD", null);
		  m2.put("RCB", 5);
//		  m2.put(null, null);
		  
		  System.out.println(m2);
		  
		  int size2 = m2.size();
		  System.out.println(size2);
		  
		  boolean containsKey2 = m2.containsKey("CSK");
		  System.out.println(containsKey2);
		  
		  boolean containsValue2 = m2.containsValue(9);
		  System.out.println(containsValue2);
		  
		  Integer remove2 = m2.remove("CSK");
		  System.out.println(remove2);
		  System.out.println(m2);
		  
		  Set<String> keySet2 = m2.keySet();
		  System.out.println(keySet2);
		  
		  Collection<Integer> values2 = m2.values();
		  System.out.println(values2);
		  
		  Set<Entry<String, Integer>> entrySet2 = m2.entrySet();
		  for (Entry<String, Integer> n2:entrySet2) {
			  System.out.println(n2);
			  
//			  String key2 = n2.getKey();
//			  System.out.println(key2);
			  
			  System.out.println(n2.getKey());
			  
			  System.out.println(n2 .getValue());
		  }
		  
//		  HashTable
		  
		  System.out.println("------------HashTable-----------");
		  Map<String,Integer> m3= new Hashtable();
		  m3.put("CSK", 9);
		  m3.put("KKR", 4);
		  m3.put("MI", 6);
		  m3.put("SRK", 7);
		  m3.put("RR", 8);
//		  m3.put("DD", null);
		  m3.put("RCB", 5);
//		  m3.put(null, null);
		  
		  System.out.println(m3);
		  
		  int size3 = m3.size();
		  System.out.println(size3);
		  
		  boolean containsKey3 = m3.containsKey("CSK");
		  System.out.println(containsKey3);
		  
		  boolean containsValue3 = m3.containsValue(9);
		  System.out.println(containsValue3);
		  
		  Integer remove3 = m3.remove("CSK");
		  System.out.println(remove3);
		  System.out.println(m3);
		  
		  Set<String> keySet3 = m3.keySet();
		  System.out.println(keySet3);
		  
		  Collection<Integer> values3 = m3.values();
		  System.out.println(values3);
		  
		  Set<Entry<String, Integer>> entrySet3 = m3.entrySet();
		  for (Entry<String, Integer> n3:entrySet3) {
			  System.out.println(n3);
			  
//			  String key3 = n3.getKey();
//			  System.out.println(key3-----);
			  
			  System.out.println(n3.getKey());
			  
			  System.out.println(n3 .getValue());
		  }
	}
}
