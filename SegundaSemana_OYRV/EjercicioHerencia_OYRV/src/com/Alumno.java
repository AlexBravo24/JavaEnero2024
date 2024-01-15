package com;

public class Alumno extends Escuela{
	
	private String grado;
	private String clase;
	private String turno;
	
	public Alumno () {
		
	}

	public Alumno(String nombre, String genero, String edad, String grado, String clase, String turno) {
		super(nombre, genero, edad);
		this.grado = grado;
		this.clase = clase;
		this.turno = turno;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Alumno [grado=" + grado + ", clase=" + clase + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
