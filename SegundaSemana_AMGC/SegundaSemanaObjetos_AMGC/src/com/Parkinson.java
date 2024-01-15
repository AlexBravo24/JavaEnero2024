package com;

public class Parkinson {
	
	private String genero;
	private int edad;
	private boolean bradicinesia;
	private boolean temblor;
	private boolean ansiedad;
	private String diagnostico;
	
	//Constructor vacío
	public Parkinson () {
		
	}
	
	//Constructor con todos los parámetros
	public Parkinson(String genero, int edad, boolean bradicinesia, boolean temblor, boolean ansiedad,
			String diagnostico) {
		super();
		this.genero = genero;
		this.edad = edad;
		this.bradicinesia = bradicinesia;
		this.temblor = temblor;
		this.ansiedad = ansiedad;
		this.diagnostico = diagnostico;
	}
	
	//Getters and Setters
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isBradicinesia() {
		return bradicinesia;
	}

	public void setBradicinesia(boolean bradicinesia) {
		this.bradicinesia = bradicinesia;
	}

	public boolean isTemblor() {
		return temblor;
	}

	public void setTemblor(boolean temblor) {
		this.temblor = temblor;
	}

	public boolean isAnsiedad() {
		return ansiedad;
	}

	public void setAnsiedad(boolean ansiedad) {
		this.ansiedad = ansiedad;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	//Método toString()
	@Override
	public String toString() {
		return "Parkinson [genero=" + genero + ", edad=" + edad + ", bradicinesia=" + bradicinesia
				+ ", temblor=" + temblor + ", ansiedad=" + ansiedad + ", diagnostico=" + diagnostico + "]";
	}
	
	
	
	

}
