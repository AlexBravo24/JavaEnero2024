package com;

public class Paciente  extends Persona {
	
	private String sintoma;
	private int dias;
	private boolean internado;
	
	public Paciente () {
		
	}

	public Paciente(String genero, String nombre, int edad, String sintoma, int dias, boolean internado) {
		super(genero, nombre, edad);
		this.sintoma = sintoma;
		this.dias = dias;
		this.internado = internado;
	}

	public Paciente(String sintoma, int dias, boolean internado) {
		super();
		this.sintoma = sintoma;
		this.dias = dias;
		this.internado = internado;
	}

	@Override
	public String toString() {
		return "Paciente [sintoma=" + sintoma + ", dias=" + dias + ", internado=" + internado + ", toString()="
				+ super.toString() + "]";
	}

	
}
