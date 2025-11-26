package com.mph.MavenProject9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {
	
	public static void main(String[] args) {
		
		 HashSet<Integer> hashSet=new HashSet<Integer>();
		 hashSet.add(56);
		 hashSet.add(34);
		 hashSet.add(87);
		 hashSet.add(54);
		 System.out.println(hashSet);
		 for(Integer i:hashSet) {
			 System.out.println(i);
		 }
		 
		 Iterator<Integer> itr=hashSet.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 hashSet.forEach(i->System.out.println(i));
		 hashSet.forEach(System.out::println);
		 
		 
		 LinkedHashSet<Integer> lHashSet=new LinkedHashSet<Integer>();
		 lHashSet.add(67);
		 lHashSet.add(45);
		 lHashSet.add(90);
		 lHashSet.add(23);
		 System.out.println(lHashSet);
		 
	}

}
