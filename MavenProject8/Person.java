package com.mph.MavenProject8;

public final class Person {

	private String name;
	private int uid;

	public String getName() {
		return name;
	}

	public int getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", uid=" + uid + "]";
	}

	public Person(String name, int uid) {
		super();
		this.name = name;
		this.uid = uid;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
