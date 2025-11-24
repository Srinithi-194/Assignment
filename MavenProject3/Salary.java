package com.mph.MavenProject3;

public class Salary {
	
	private int empId;
	private String empName;
	private double salary;
	@Override
	public String toString() {
		return "Salary [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Salary(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
