package com;

public class Camara {
	
	private String tipo;
	private String resolucion;
	
	public Camara() {
		
	}

	public Camara(String tipo, String resolucion) {
		super();
		this.tipo = tipo;
		this.resolucion = resolucion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Camara [tipo=" + tipo + ", resolucion=" + resolucion + "]";
	}
	
	
	
}
