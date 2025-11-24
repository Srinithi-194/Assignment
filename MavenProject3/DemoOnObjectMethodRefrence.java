package com.mph.MavenProject3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnObjectMethodRefrence {

	public static void main(String[] args) {
		
		String myname="Srinithi";
		Supplier<Integer> lengthUsingLambda=()->myname.length();
		
		Supplier<Integer> lengthUsingMR=myname::length;
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=()->h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		
		NumberUtilMR n=new NumberUtilMR();
		Predicate<Integer> isEvenMR=n::isEven;
		
		System.out.println(isEvenMR.test(67));
		
		Function<Integer,Integer> squareNum=n::sqrt;
		System.out.println(squareNum.apply(54));
		
		Function<Double,Double> logNumMR=n::logNun;
		System.out.println(logNumMR.apply(5.0));
		
		int arr[]= {7,4,5,9,2,0};
		Consumer<int[]> printMR=n::printNum;
		printMR.accept(arr);
		
		Salary emp1=new Salary(123,"Srinithi",50000);
    	Salary emp2=new Salary(124,"Vishal",60000);
    	Salary emp3=new Salary(125,"Subha",40000);
    	Salary emp4=new Salary(126,"Praveen",30000);
    	Salary emp5=new Salary(127,"Bala",70000);
		String[] fruits = { "Apple", "Banana", "Cherry", "Mango", "Orange" };
		Salary[] empArr= {emp1,emp2,emp3,emp4,emp5};
		Consumer<String[]> filterA = n::filter;
		filterA.accept(fruits);
		
		Consumer<Salary[]> printbon = n::salwithbonus;
		printbon.accept(empArr);
		
	}

}

class Hello{
	 
	public String sayHello() {
		return "Helloooooooo";
	}
}

class NumberUtilMR{
	
	public int sqrt(int num) {
		return num*num;
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public double logNun(double num) {
		return Math.log(num);
	}
	
	public void printNum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
	}
	public void filter(String[] arr) {
		for (String i : arr)
			if (i.contains("A")) {
				System.out.println(i);
			}
	}
 
	public void salwithbonus(Salary[] arr) {
		for (Salary e : arr) {
			System.out.println(e.toString() + ", Bonus given " + e.getSalary() * 0.10);
		}
	}
}
