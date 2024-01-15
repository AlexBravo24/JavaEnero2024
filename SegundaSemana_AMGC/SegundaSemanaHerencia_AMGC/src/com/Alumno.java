package com;

public class Alumno extends Persona {
	
	private String universidad;
	private int semestre;
	private double promedio;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String genero, int edad, String universidad, int semestre, double promedio) {
		super(nombre, genero, edad);
		this.universidad = universidad;
		this.semestre = semestre;
		this.promedio = promedio;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Alumno [universidad=" + universidad + ", semestre=" + semestre + ", promedio=" + promedio
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
