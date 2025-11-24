package com.mph.MavenProject3;

import java.util.function.Predicate;

public class DemoOnPredicate {
	
	public static void main(String arg[]) {
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(35)) {
			System.out.println("even");
		}
		else {
			System.out.println("Odd");
		}
		System.out.println(isEven.test(78)?"even":"odd");
		
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test("Srinithi"));
		
		Salary emp1=new Salary(123,"Srinithi",50000);
    	Salary emp2=new Salary(124,"Vishal",60000);
    	Salary emp3=new Salary(125,"Subha",40000);
    	Salary emp4=new Salary(126,"Praveen",30000);
    	Salary emp5=new Salary(127,"Bala",70000);
    	
    	Salary[] empArr= {emp1,emp2,emp3,emp4,emp5};
		
		Predicate<Salary> checkSalary=(emp)->emp.getSalary()>=50000;
		
		for(Salary e:empArr) {
			if(checkSalary.test(e)) {
				System.out.println(e);
			}
		}
				
	}

}
