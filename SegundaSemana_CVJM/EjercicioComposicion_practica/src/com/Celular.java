package com;

public class Celular {

	private String marca;
	private String modelo;
	private int almacenamiento;
	private String color;
	
	private Camara cam;
	private Procesador pro;
	
	public Celular(){
		
	}

	public Celular(String marca, String modelo, int almacenamiento, String color, Camara cam, Procesador pro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.almacenamiento = almacenamiento;
		this.color = color;
		this.cam = cam;
		this.pro = pro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Procesador getPro() {
		return pro;
	}

	public void setPro(Procesador pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", almacenamiento=" + almacenamiento + ", color="
				+ color + ", cam=" + cam + ", pro=" + pro + "]";
	}

	
	}
	
	

