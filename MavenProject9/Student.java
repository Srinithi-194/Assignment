package com.mph.MavenProject9;

public class Student implements Comparable<Student>{
	
	private int studId;
	private String studName;
	private int age;
	private double marks;
	private String city;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", age=" + age + ", marks=" + marks + ", city="
				+ city + "]";
	}
	public Student(int studId, String studName, int age, double marks, String city) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.marks = marks;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int)(this.marks-o.marks);
	}
	
	

}
