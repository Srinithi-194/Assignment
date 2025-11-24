package com.mph.MavenProject3;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodReference {
	
	static class NumberUtil{
		
		public static int squareNum(int num) {
			return num*num;
		}
		
		public static double log(double num) {
			return Math.log(num);
					
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
	}
		
		static class StringUtil{
			
			public static int length(String str) {
				return str.length();
			}
			
		}
	
	public static void main(String arg[]) {
		
		Function<Integer,Integer> squareFunction=(num)->NumberUtil.squareNum(num);
		Function<Integer,Integer> squareFunctionMR=NumberUtil::squareNum;
		
		System.out.println(squareFunction.apply(6));
		System.out.println(squareFunctionMR.apply(8));
		
		Function<Double,Double> logUsingMR=NumberUtil::log;
		Function<Double,Double> logUsingLambda=(num)->NumberUtil.log(num);
		System.out.println(logUsingMR.apply(5.0));
		System.out.println(logUsingLambda.apply(6.0));
		
		Predicate<Integer> isEvenUsingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
		
		System.out.println(isEvenUsingLambda.test(34));
		System.out.println(isEvenUsingMR.test(21));
		
		Function<String,Integer> strLen=(str)->StringUtil.length(str);
		Function<String,Integer> strLenUsinMR=StringUtil::length;
		
		System.out.println(strLen.apply("str"));
		System.out.println(strLenUsinMR.apply("strlen"));
		
	}

}
