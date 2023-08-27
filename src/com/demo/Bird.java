package com.demo;

public abstract class Bird {

	private String type;
	private String color;
	private double weight;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("The Bird eats");
	}
}
