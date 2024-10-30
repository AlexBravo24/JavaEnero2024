package com;

public class Camara {
	
	private String marca;
	private int numeroDeCamaras;
	
	public Camara() {
		
	}

	public Camara(String marca, int numeroDeCamaras) {
		super();
		this.marca = marca;
		this.numeroDeCamaras = numeroDeCamaras;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroDeCamaras() {
		return numeroDeCamaras;
	}

	public void setNumeroDeCamaras(int numeroDeCamaras) {
		this.numeroDeCamaras = numeroDeCamaras;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", numeroDeCamaras=" + numeroDeCamaras + "]";
	}

	
	
}
