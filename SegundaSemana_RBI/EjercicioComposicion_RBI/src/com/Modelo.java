package com;

public class Modelo {
	
	private String tama�o;
	private String a�o;
	
	public Modelo() {
		
	}

	public Modelo(String tama�o, String a�o) {
		super();
		this.tama�o = tama�o;
		this.a�o = a�o;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Modelo [tama�o=" + tama�o + ", a�o=" + a�o + "]";
	}
	
	

}
