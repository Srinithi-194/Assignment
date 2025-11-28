package com.mph.MavenProject1;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1=new Student(123,"Srinithi",90,22);
//		Student.College c1=new Student().new College("abc college","bglr",1234);
//		System.out.println(c1);
//		System.out.println(s1);
		
		
		Class1 c1=new Class1();
		c1.sayHello();
		
		
		
		Interface1 i1=new Class1();
		i1.sayHello();
		
		Interface2 i2=new Class1();
		i2.sayHello();
		
		
		String s2="hello";
		String s3=new String("hello");
		System.out.println(s2.concat(s3));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

	}

}
