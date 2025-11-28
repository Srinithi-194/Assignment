package com.mph.MavenProject11;

import java.io.Serializable;

public class Bottle implements Serializable {
	
	private int bottleId;
	private String brand;
	private double cost;
	private String color;
	public Bottle(int bottleId, String brand, double cost, String color) {
		super();
		this.bottleId = bottleId;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}
	public Bottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bottle [bottleId=" + bottleId + ", brand=" + brand + ", cost=" + cost + ", color=" + color + "]";
	}
	
	

}
