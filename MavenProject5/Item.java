package com.mph.MavenProject5;

public class Item {
	
	private int id;
	private String itemName;
	private double cost;
	public Item(int id, String itemName, double cost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", cost=" + cost + "]";
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
