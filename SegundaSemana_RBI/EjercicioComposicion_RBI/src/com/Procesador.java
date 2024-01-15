package com;

public class Procesador {
	
	private String mod;
	private String desarrollador;
	private String nucleos;
	
	public Procesador() {
		
	}

	public Procesador(String mod, String desarrollador, String nucleos) {
		super();
		this.mod = mod;
		this.desarrollador = desarrollador;
		this.nucleos = nucleos;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	public String getNucleos() {
		return nucleos;
	}

	public void setNucleos(String nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [mod=" + mod + ", desarrollador=" + desarrollador + ", nucleos=" + nucleos + "]";
	}
	
	

}
