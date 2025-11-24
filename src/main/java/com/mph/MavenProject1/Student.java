package com.mph.MavenProject1;

import java.util.Objects;

public class Student {

	private int studId;
	private String studName;
	private int marks;
	private int age;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", marks=" + marks + ", age=" + age + "]";
	}
	public Student(int studId, String studName, int marks, int age) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, marks, studId, studName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && marks == other.marks && studId == other.studId
				&& Objects.equals(studName, other.studName);
	}
	
	class College{
		
		private String colName;
		private String location;
		private long colCode;
		public String getColName() {
			return colName;
		}
		public void setColName(String colName) {
			this.colName = colName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getColCode() {
			return colCode;
		}
		public void setColCode(long colCode) {
			this.colCode = colCode;
		}
		@Override
		public String toString() {
			return "College [colName=" + colName + ", location=" + location + ", colCode=" + colCode + "]";
		}
		public College(String colName, String location, long colCode) {
			super();
			this.colName = colName;
			this.location = location;
			this.colCode = colCode;
		}
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}
	
	
	
}
