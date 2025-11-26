package com.mph.MavenProject5;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static <T> void display(T data) {
		System.out.println(data);
	}
	
	public static <T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1);
		System.out.println(u1);
		System.out.println(t1.doubleValue()+u1.doubleValue());
	}

	public static void main(String[] args) {
		
//		Container<String> c1=new Container<String>();
//		c1.setItem("Srinithi");
//		System.out.println(c1.getItem());
//		
//		Container<Student> c2=new Container<Student>();
//		Student s=new Student();
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(67);
//		System.out.println(c3.getItem());
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer[] irr= {45,65,87,43,90};
//		c4.setItem(irr);
//		System.out.println(Arrays.toString(c4.getItem()));
		
//		
//		Pair<String,Double> p1=new Pair<String,Double>("distance",7.5);
//		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.0);
//		Pair<Integer,String> p3=new Pair<Integer,String>(12345,"Laptop");
//		
//		Student s=new Student(123,"Amit","java");
//		Pair<Integer,Student> p4=new Pair<Integer,Student>(1,s);
//		System.out.println(p4.getValue());
		
		
		
//		Order<String> o1=new Order<String>("Laptop");
//		Order<String> o2=new Order<String>("Desktop");
//		System.out.println(01);
//		System.out.println(o2);
//		
//		Item item=new Item(12,"Laptop",50000);
//		Order<Item> o3=new Order<Item>(item);
//		System.out.println(o3);
//		
//		Item[] itemArr=new Item[3];
//		itemArr[0]=new Item(1,"Laptop",56000.00);
//		itemArr[1]=new Item(2,"Mobile",40000.00);
//		itemArr[2]=new Item(3,"Desktop",70000.00);
//		
//		Order<Item[]> o4=new Order<Item[]>(itemArr);
//		System.out.println(Arrays.toString(o4.getItem()));
//		
//		Integer nums[]= {4,5,6,7,8,9};
//		String strs[]= {"str1","str2","str3","str4"};
//		ArrayPrinter<Integer> ap1=new ArrayPrinter<>(nums);
//		ArrayPrinter<String> ap2=new ArrayPrinter<>(strs);
//		System.out.println(ap1);
//		System.out.println(ap2);
		
		
		
		display("Srinithi");
		display(34);
		display(true);
		Item item=new Item(11,"Mobile",45000);
		display(item);
		add(5,6);
		add(33.98,76.45
				);
	}

}
