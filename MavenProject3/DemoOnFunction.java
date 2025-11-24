package com.mph.MavenProject3;

import java.util.function.Function;

public class DemoOnFunction {

	public static void main(String[] args) {
		
		Function<Integer,Integer> squareFunction=(num)->num*num;
		int arr[]= {3,2,5,7,1,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(squareFunction.apply(arr[i]));
		}
		
		Salary emp1=new Salary(123,"Srinithi",50000);
    	Salary emp2=new Salary(124,"Vishal",60000);
    	Salary emp3=new Salary(125,"Subha",40000);
    	Salary emp4=new Salary(126,"Praveen",30000);
    	Salary emp5=new Salary(127,"Bala",70000);
    	
    	Salary[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	
    	Function<Salary,String> upperCase=(e)->e.getEmpName().toUpperCase();
    	for(Salary e1:empArr) {
    		System.out.println(upperCase.apply(e1));
    	}
    	
    	Function<Integer,Integer> add20=(num)->num+20;
    	System.out.println(squareFunction.andThen(add20).apply(5));
    	
    	Function<Salary,Salary> checkSalary=(e)->{
    		if(e.getSalary()>50000) {
    			return e;
    		}
    		else {
    			return null;
    		}
    	};

	}

}
