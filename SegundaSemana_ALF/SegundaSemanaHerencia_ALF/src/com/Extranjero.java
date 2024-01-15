package com;

public class Extranjero extends Persona{

	private String nacionalidad;
	private int noPasaporte;
	private String estadoCivil;
	private double ingreso;
	private String etnia;
	
	public Extranjero() {
		
	}

	public Extranjero(String nombre, String genero, int edad, String nacionalidad, int noPasaporte, String estadoCivil,
			double ingreso, String etnia) {
		super(nombre, genero, edad);
		this.nacionalidad = nacionalidad;
		this.noPasaporte = noPasaporte;
		this.estadoCivil = estadoCivil;
		this.ingreso = ingreso;
		this.etnia = etnia;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNoPasaporte() {
		return noPasaporte;
	}

	public void setNoPasaporte(int noPasaporte) {
		this.noPasaporte = noPasaporte;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	@Override
	public String toString() {
		return "Extranjero [nacionalidad=" + nacionalidad + ", noPasaporte=" + noPasaporte + ", estadoCivil="
				+ estadoCivil + ", ingreso=" + ingreso + ", etnia=" + etnia + ", toString()=" + super.toString() + "]";
	}
	
}
