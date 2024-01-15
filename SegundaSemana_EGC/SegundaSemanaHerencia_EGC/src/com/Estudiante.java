package com;

public class Estudiante extends Persona {

	private String carrera;
	private String horario;
	private double promedio;

	public Estudiante() {

	}

	public Estudiante(String nombre, String genero, int edad, String carrera, String horario, double promedio) {
		super(nombre, genero, edad);
		this.carrera = carrera;
		this.horario = horario;
		this.promedio = promedio;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", horario=" + horario + ", promedio=" + promedio + ", toString()="
				+ super.toString() + "]";
	}

}
