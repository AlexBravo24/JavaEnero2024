package com;

public class TarjetaVideo {

	private String fabricante;
	private String tecnologia;
	private double teraflops;
	private double frecuencia;

	public TarjetaVideo() {

	}

	public TarjetaVideo(String fabricante, String tecnologia, double teraflops, double frecuencia) {
		super();
		this.fabricante = fabricante;
		this.tecnologia = tecnologia;
		this.teraflops = teraflops;
		this.frecuencia = frecuencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public double getTeraflops() {
		return teraflops;
	}

	public void setTeraflops(double teraflops) {
		this.teraflops = teraflops;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "TarjetaVideo [fabricante=" + fabricante + ", tecnologia=" + tecnologia + ", teraflops=" + teraflops
				+ ", frecuencia=" + frecuencia + "]";
	}

}
