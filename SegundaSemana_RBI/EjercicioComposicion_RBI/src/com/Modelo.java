package com;

public class Modelo {
	
	private String tamaño;
	private String año;
	
	public Modelo() {
		
	}

	public Modelo(String tamaño, String año) {
		super();
		this.tamaño = tamaño;
		this.año = año;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Modelo [tamaño=" + tamaño + ", año=" + año + "]";
	}
	
	

}
