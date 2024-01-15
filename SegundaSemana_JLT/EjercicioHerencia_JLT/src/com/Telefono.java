package com;

public class Telefono {
	
	private String marca;
	private String gamma;
	private String color;
	
	public Telefono () {
		
	}

	public Telefono(String marca, String gamma, String color) {
		super();
		this.marca = marca;
		this.gamma = gamma;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGamma() {
		return gamma;
	}

	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", gamma=" + gamma + ", color=" + color + "]";
	}
	
	

	
	}

	
