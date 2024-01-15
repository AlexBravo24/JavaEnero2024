package com;

public class Consola {

	private String fabricante;
	private String modelo;
	private int releaseYear;

	private TarjetaVideo gpu;
	private AlmacenamientoInterno ssd;

	public Consola() {

	}

	public Consola(String fabricante, String modelo, int releaseYear, TarjetaVideo gpu, AlmacenamientoInterno ssd) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.releaseYear = releaseYear;
		this.gpu = gpu;
		this.ssd = ssd;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public TarjetaVideo getGpu() {
		return gpu;
	}

	public void setGpu(TarjetaVideo gpu) {
		this.gpu = gpu;
	}

	public AlmacenamientoInterno getSsd() {
		return ssd;
	}

	public void setSsd(AlmacenamientoInterno ssd) {
		this.ssd = ssd;
	}

	@Override
	public String toString() {
		return "Consola [fabricante=" + fabricante + ", modelo=" + modelo + ", releaseYear=" + releaseYear + ", gpu="
				+ gpu + ", ssd=" + ssd + "]";
	}

}
