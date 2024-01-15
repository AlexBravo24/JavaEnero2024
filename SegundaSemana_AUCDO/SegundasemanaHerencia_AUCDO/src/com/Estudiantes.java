package com;

public class Estudiantes extends Persona{

	private String matricula;
	private String facultad;
	private String tiempo;
	
	public Estudiantes() {
		
	}

	public Estudiantes(String nombre, String genero, int edad, String matricula, String facultad, String tiempo) {
		super(nombre, genero, edad);
		this.matricula = matricula;
		this.facultad = facultad;
		this.tiempo = tiempo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Estudiantes [matricula: " + matricula + ", facultad: " + facultad + ", tiempo: " + tiempo + ", toString()="
				+ super.toString() + "]";
	}
		
	
}
