package com.mph.MavenProject10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        
    	Integer arr[]= {23,56,87,67,89,98,76,34,21};
    	Arrays.stream(arr).forEach(System.out::println);
    	System.out.println("--------------------------");
    	List<Integer> iList=Arrays.stream(arr).collect(Collectors.toList());
    	System.out.println(iList);
    	Integer min=Arrays.stream(arr).min((a,b)->a-b).get();
    	System.out.println(min);
    	min=Arrays.stream(arr).min(Integer::compare).get();
    	
    	long count=Arrays.stream(arr).count();
    	System.out.println(count);
    	
    	int sum=Arrays.stream(arr).reduce(0,(a,b)->a+b);
    	System.out.println(sum);
    	
    	int mul=Arrays.stream(arr).reduce(1,(a,b)->a*b);
    	System.out.println(mul);
    	
    	System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));
    	
    	Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
    	
    	Stream.of(arr).map(num->num+10).forEach(System.out::println);
    	
    	Stream.of(arr).limit(5).forEach(System.out::println);
    	
    	System.out.println(Stream.of(arr).anyMatch(num->num>25));
    	
    	Integer[] nums= {23,12,65,78,98,56,45,34};
    	List<Integer> numList=Arrays.asList(nums);
    	numList.stream().filter(num->num%3==0).distinct().skip(2).limit(2).forEach(System.out::println);
    	
    	numList.stream().sorted().forEach(System.out::println);
    	
    	numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
    	String[] names= {"sri","vishal","gayathri","ramya","sam","aadhil","siraj"};
    	Arrays.stream(names).filter(name->name.length()>5).filter(name->name.startsWith("s")).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    
    	Employee emp1=new Employee(123,"sri",70000,"developer","it");
    	Employee emp2=new Employee(124,"vishal",60000,"trainer","training");
    	Employee emp3=new Employee(125,"gayathri",50000,"accountant","accounts");
    	Employee emp4=new Employee(126,"harish",55000,"manager","accounts");
    	Employee emp5=new Employee(127,"sam",45000,"salesrep","sales");
    	
    	List<Employee> elist=new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
    	elist.stream().filter(emp->emp.getSalary()<50000).forEach(System.out::println);
    	elist.stream().filter(emp->emp.getDesg().equals("Manager")).forEach(System.out::println);
    	
    
    
    }
}
