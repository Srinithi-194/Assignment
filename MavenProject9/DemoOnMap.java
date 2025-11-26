package com.mph.MavenProject9;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
//		hashMap.put(1, "Bangalore");
//		hashMap.put(42, "Chennai");
//		hashMap.put(23, "Hyderabad");
//		hashMap.put(34, "Pune");
//		hashMap.put(65, "Canada");
//		hashMap.put(3, null);
//		
//		System.out.println(hashMap);
//		
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.entrySet());
//		System.out.println(hashMap.get(3));
//		
//		Set<Integer> keySet=hashMap.keySet();
//		Set<String> valueSet=new HashSet<String>(hashMap.values());
//		System.out.println(valueSet);
//		Iterator<Integer> keyItr=keySet.iterator();
//		while(keyItr.hasNext()) {
//			System.out.println(keyItr.next());
//		}
//		
//		Iterator<Entry<Integer,String>> entry=hashMap.entrySet().iterator();
//		while(entry.hasNext()) {
//			System.out.println(entry.next());
//		}
		
//		TreeMap<Integer, Integer> treeMap=new TreeMap<Integer, Integer>();
//		treeMap.put(1, 1);
//		treeMap.put(5, 25);
//		treeMap.put(3, 9);
//		treeMap.put(9, 81);
//		System.out.println(treeMap);
//		System.out.println(treeMap.ceilingEntry(4));
//		System.out.println(treeMap.descendingMap());
//		
		
		Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
		hashtable.put(3, "Sri");
		hashtable.put(2, "Vishal");
		hashtable.put(1, "Gayathri");
		hashtable.put(6, "Harish");
		System.out.println(hashtable);
		Enumeration<Integer> keys=hashtable.keys();
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}
		Enumeration<String> values=hashtable.elements();
		while(values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}
		
	}

}
