package com.mph.MavenProject9;

import java.util.Iterator;
import java.util.TreeSet;

import com.mph.MavenProject9.Student;

public class DemoOnTreeSet {
	
	public static void main(String[] args) {
		
//		TreeSet<Integer> treeSet=new TreeSet<Integer>();
//		treeSet.add(65);
//		treeSet.add(56);
//		treeSet.add(87);
//		treeSet.add(45);
//		System.out.println(treeSet);
//		System.out.println(treeSet.ceiling(46));
//		System.out.println(treeSet.floor(89));
//		
//		Iterator<Integer> itr=treeSet.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println(treeSet.headSet(56));
//		System.out.println(treeSet.tailSet(56));
//		System.out.println(treeSet.higher(90));
		
		TreeSet<Student> s1=new TreeSet<Student>();
		s1.add(new Student(101, "Sri", 22, 89, "Bangalore"));
		s1.add(new Student(102, "Vishal", 23, 90, "Bangalore"));
		s1.add(new Student(103, "Sham", 21, 78, "Bangalore"));
		s1.add(new Student(104, "Adhil", 22, 67, "Chennai"));
		s1.add(new Student(105, "Siraj", 23, 87, "Chennai"));
		
		Iterator<Student> itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
