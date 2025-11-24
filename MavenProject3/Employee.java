
package com.mph.MavenProject3;

import java.util.Arrays;
import java.util.Comparator;


interface MyComparator {
    int salComparator(Salary a,Salary b);
}

public class Employee {


	public static void main(String[] args) {
    	
    	Salary emp1=new Salary(123,"Srinithi",50000);
    	Salary emp2=new Salary(124,"Vishal",60000);
    	Salary emp3=new Salary(125,"Subha",40000);
    	Salary emp4=new Salary(126,"Praveen",30000);
    	Salary emp5=new Salary(127,"Bala",70000);
    	
    	Salary[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	

//        MyComparator comparator = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
//
//        Arrays.sort(empArr, (a, b) -> comparator.salComparator(a, b));
        
        Arrays.sort(empArr,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));

    	
    	for(Salary employee:empArr) {
    		System.out.println(employee);
    	}
    	
    	
    }

}
