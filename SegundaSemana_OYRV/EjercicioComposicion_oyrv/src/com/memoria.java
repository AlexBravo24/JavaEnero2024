package com;

public class memoria {
	
	private String marca;
	private String tipo;
	private String capacidad;
	
    public memoria() {
		
	}

	public memoria(String marca, String tipo, String capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "memoria [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}
    
    


}
