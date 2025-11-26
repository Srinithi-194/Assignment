package com.mph.MavenProject8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {

	private static final ArrayList<Student> StudentList = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList alist = new ArrayList();
//		alist.add(56);
//		alist.add("sri");
//		alist.add(true);
//		alist.add(76.45);
//		Person p = new Person("vishal", 123);
//		alist.add(p);
//		alist.add(76.45);
//		alist.add(null);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//
//		ArrayList<String> namesList = new ArrayList<String>();
//		namesList.add("Sri");
//		namesList.add("Vishal");
//		namesList.add("Siraj");
//		namesList.add("adhil");
//		System.out.println(namesList);
//
//		for (String name : namesList) {
//			System.out.println(name);
//		}
//		System.out.println("-------------------------------------");
//		Iterator<String> itr = namesList.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		System.out.println("-------------------------------------");
//		ListIterator<String> litr = namesList.listIterator();
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		System.out.println("----ll------------------------------");
//		while (litr.hasPrevious()) {
//			System.out.println(litr.previous());
//
//		}
//		System.out.println("--------------------------------");
//		namesList.forEach(name -> System.out.println(name));
//		System.out.println("--------------------------------");
//		namesList.forEach(System.out::println);
//		System.out.println(namesList.remove(3));
//
//		Integer[] arr = { 2, 3, 4, 5, 6, 7 };
//		Integer[] brr = { 1, 2, 3, 4, 5 };
//
//		List<Integer> numsList1 =new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> numsList2=new ArrayList<Integer>(Arrays.asList(brr));
//		System.out.println(numsList1);
//		numsList1.retainAll(numsList2);
//		System.out.println(numsList1);
//		
//		Collections.sort(namesList);
//		System.out.println(namesList);
//		
//		ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
//		
//		clonedNamesList.add("sri");
//		System.out.println(clonedNamesList.hashCode());

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Sri", 22, 89, "Bangalore"));
		studentList.add(new Student(102, "Vishal", 23, 90, "Bangalore"));
		studentList.add(new Student(103, "Sham", 21, 78, "Bangalore"));

		studentList.add(new Student(104, "Adhil", 22, 67, "Chennai"));
		studentList.add(new Student(105, "Siraj", 23, 87, "Chennai"));
		studentList.add(new Student(106, "Anu", 20, 92, "Chennai"));

		studentList.add(new Student(107, "Kiran", 24, 85, "Delhi"));
		studentList.add(new Student(108, "Megha", 22, 80, "Delhi"));
		studentList.add(new Student(109, "Ravi", 23, 76, "Delhi"));

		studentList.add(new Student(110, "Divya", 21, 88, "Pune"));
		studentList.add(new Student(111, "Arjun", 22, 91, "Pune"));
		studentList.add(new Student(112, "Neha", 23, 83, "Pune"));

		studentList.add(new Student(113, "Rahul", 21, 79, "Hyderabad"));
		studentList.add(new Student(114, "Pooja", 22, 86, "Hyderabad"));
		studentList.add(new Student(115, "Sanjay", 24, 84, "Hyderabad"));

		for (Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------");
		Collections.sort(studentList);
		for (Student s1 : studentList) {
			System.out.println(s1);
		}
		
		studentList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new MarksComparator()));
		System.out.println("==================================");
		for(Student s:studentList) {
			System.out.println(s);
		}

	}

}
