package com.mph.MavenProject3;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoOnConsumer {

	public static void main(String[] args) {
		
		Consumer<Integer> squareConsumer=(num1)->{
			System.out.println(num1*num1);
		};
		squareConsumer.accept(5);
		
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
		};
		
		Integer[] arr= {54,76,29,45,98,12,34};
		sortConsumer.accept(arr);
		
		Salary emp1=new Salary(123,"Srinithi",50000);
    	Salary emp2=new Salary(124,"Vishal",60000);
    	Salary emp3=new Salary(125,"Subha",40000);
    	Salary emp4=new Salary(126,"Praveen",30000);
    	Salary emp5=new Salary(127,"Bala",70000);
    	
    	Salary[] empArr= {emp1,emp2,emp3,emp4,emp5};

		Consumer<Salary[]> printConsumer=(err)->{
			for(Salary e:err) {
				System.out.println(e.getEmpName());
			}
		};
		printConsumer.accept(empArr);
	}

}
