package com;

public class Estudiante extends Persona{

	private String escuela;
	private String licenciatura;
	
	public Estudiante() {
		
	}

	public Estudiante(String escuela, String licenciatura) {
		super();
		this.escuela = escuela;
		this.licenciatura = licenciatura;
	}

	public Estudiante(String nombre, String genero, String edad, String escuela, String licenciatura) {
		super(nombre, genero, edad);
		this.escuela = escuela;
		this.licenciatura = licenciatura;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getLicenciatura() {
		return licenciatura;
	}

	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}

	@Override
	public String toString() {
		return "Estudiante [escuela=" + escuela + ", licenciatura=" + licenciatura + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
