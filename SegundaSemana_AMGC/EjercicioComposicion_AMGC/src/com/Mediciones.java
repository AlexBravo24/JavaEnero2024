package com;

public class Mediciones {
	
	private boolean presion;
	private boolean oxigeno;
	private boolean estres;
	
	public Mediciones() {
		
	}

	public Mediciones(boolean presion, boolean oxigeno, boolean estres) {
		super();
		this.presion = presion;
		this.oxigeno = oxigeno;
		this.estres = estres;
	}

	public boolean isPresion() {
		return presion;
	}

	public void setPresion(boolean presion) {
		this.presion = presion;
	}

	public boolean isOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(boolean oxigeno) {
		this.oxigeno = oxigeno;
	}

	public boolean isEstres() {
		return estres;
	}

	public void setEstres(boolean estres) {
		this.estres = estres;
	}

	@Override
	public String toString() {
		return "Mediciones [presion=" + presion + ", oxigeno=" + oxigeno + ", estres=" + estres + "]";
	}
	

}
