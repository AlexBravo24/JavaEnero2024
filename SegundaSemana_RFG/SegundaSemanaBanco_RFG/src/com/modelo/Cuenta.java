package com.modelo;

public class Cuenta {
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String nombre;
	
	public Cuenta() {
		
	}

	

	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String nombre) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.nombre = nombre;
	}



	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSaldoMin() {
		return saldoMin;
	}



	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}



	public double getSaldoMax() {
		return saldoMax;
	}



	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}



	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", nombre=" + nombre + "]";
	}

}
