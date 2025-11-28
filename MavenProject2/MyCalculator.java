package com.mphasis.MavenProject2;

import java.util.Arrays;

public class MyCalculator {

	
//
//	@Override
//	public int add(int a, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator mc=(int a,int b) -> a+b;
//		System.out.println(mc.add(5, 6));

//		Calculator c=(int a,int b) ->
//			System.out.println(a-b);
//			c.sub(78, 32);
		
//		Calculator c=()->{
//			int a=89,b=4;
//			System.out.println(a*b);
//		};
		
//		Calculator c=()->{
//			int a=5,b=2;
//			return ((float)a/b);
//		};
//		System.out.println(c.div());
		
		PrintName printer=(name)->System.out.println("Name:" + name);
		printer.printName("Srinithi");
		
//		ReverseString rev=(name)->
//		{
//			StringBuilder sb=new StringBuilder(name);
//			System.out.println("Reverse" + sb.reverse().toString());
//		
//		};
//		
//		String[] name= {"banana","apple","orange"};
		
		Sort n=(String[] name)->{
			Arrays.sort(name);
			for(String i:name) {
				System.out.println(i);
			}
		};
		//n.Sort(name);
		
		
	}

}
