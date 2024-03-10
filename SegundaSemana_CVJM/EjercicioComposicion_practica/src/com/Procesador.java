package com;

public class Procesador {
	
	private String tipo;
	private String ram;
	
	public Procesador() {
		
	}

	public Procesador(String tipo, String ram) {
		super();
		this.tipo = tipo;
		this.ram = ram;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Procesador [tipo=" + tipo + ", ram=" + ram + "]";
	}

	
	
	
	
}
