package com.mph.MavenProject1;

public class Calculate implements ScientificInterface{

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(double d1,double d2) {
		System.out.println(d1+d2);
	}
	
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	
	public void add(long l,double d) {
		System.out.println(l+d);
	}
	public void add(double d,long l) {
		System.out.println(d+l);
	}
	
	public void add(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber c3=new ComplexNumber();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+i"+c3.imag);
	}

	public static void main(String args[]) {
//		Calculate c=new Calculate();
//		c.add(4, 6);
//		c.add("sri", "nithi");
//		ComplexNumber c1=new ComplexNumber(3,4);
//		ComplexNumber c2=new ComplexNumber(5,6);
//		c.add(c1, c2);
	
		Student s1=new Student(123,"Srinithi",78,22);
		Student s2=new Student(123,"Srinithi",78,22);
		
		
		
		
		
	
		
	}

	@Override
	public double power(double m, double n) {
		// TODO Auto-generated method stub
		return Math.pow(m, n);
	}

	@Override
	public double squareRoot(double m) {
		// TODO Auto-generated method stub
		return Math.sqrt(m);
	}

	@Override
	public double log(double m) {
		// TODO Auto-generated method stub
		return Math.log(m);
	}
	
}
