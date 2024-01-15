package com;

public class equipo {
	
	private int jugadores;
	private String dt;
	private String balones;
	private String auxiliares;
	private String nombre;
	
	public equipo () {
		
	}

	public equipo(int jugadores, String dt, String balones, String auxiliares, String nombre) {
		super();
		this.jugadores = jugadores;
		this.dt = dt;
		this.balones = balones;
		this.auxiliares = auxiliares;
		this.nombre = nombre;
	}

	public equipo(int jugadores) {
		super();
		this.jugadores = jugadores;
	}

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getBalones() {
		return balones;
	}

	public void setBalones(String balones) {
		this.balones = balones;
	}

	public String getAuxiliares() {
		return auxiliares;
	}

	public void setAuxiliares(String auxiliares) {
		this.auxiliares = auxiliares;
	}

	public String getnombre() {
		return nombre;
	}

	public void setUniformes(String uniformes) {
		this.nombre = uniformes;
	}

	@Override
	public String toString() {
		return "equipo [jugadores=" + jugadores + ", dt=" + dt + ", balones=" + balones + ", auxiliares=" + auxiliares
				+ ", uniformes=" + nombre + "]";
	}

	
	

}
