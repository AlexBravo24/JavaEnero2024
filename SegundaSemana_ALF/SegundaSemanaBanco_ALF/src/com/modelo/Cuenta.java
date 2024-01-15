package com.modelo;

public class Cuenta {
	
	//En el paquete com.modelo guardamos la informacion
	//de la entidades u objetos a los cuales
	//queremos acceder, para este ejemplo creamos varias
	//cuentas a almacenar en un HasMap para
	//simular una pequeña BD.
	
	private String usuario;
	private double saldo;
	private double saldoMIn;
	private double saldoMax;
	private String tipo;
	
	public Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, double saldoMIn, double saldoMax, String tipo) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMIn = saldoMIn;
		this.saldoMax = saldoMax;
		this.tipo = tipo;
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

	public double getSaldoMIn() {
		return saldoMIn;
	}

	public void setSaldoMIn(double saldoMIn) {
		this.saldoMIn = saldoMIn;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMIn=" + saldoMIn + ", saldoMax=" + saldoMax
				+ ", tipo=" + tipo + "]";
	}
	

}
