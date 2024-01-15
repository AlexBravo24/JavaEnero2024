package com;

public class RazaPerro {

	private String name;
	private String colors;
	private double maxSize;
	private double maxWeight;
	private int maxAge;

	public RazaPerro() {

	}

	public RazaPerro(String name, String colors, double maxSize, double maxWeight, int maxAge) {
		super();
		this.name = name;
		this.colors = colors;
		this.maxSize = maxSize;
		this.maxWeight = maxWeight;
		this.maxAge = maxAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public double getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(double maxSize) {
		this.maxSize = maxSize;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "RazaPerro [name=" + name + ", colors=" + colors + ", maxSize=" + maxSize + ", maxWeight=" + maxWeight
				+ ", maxAge=" + maxAge + "]";
	}
	
	

}
