package com;

public class Procesador {
	
	private String tipo;
	
	public Procesador() {
		
	}

	public Procesador(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Procesador [tipo=" + tipo + "]";
	}
	
	

}
