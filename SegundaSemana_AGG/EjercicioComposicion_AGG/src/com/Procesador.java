package com;

public class Procesador {

	private int frecuencia;
	private int nucleos;
	
	public Procesador() {}

	public Procesador(int frecuencia, int nucleos) {
		super();
		this.frecuencia = frecuencia;
		this.nucleos = nucleos;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [frecuencia=" + frecuencia + ", nucleos=" + nucleos + "]";
	}
	
	
}
