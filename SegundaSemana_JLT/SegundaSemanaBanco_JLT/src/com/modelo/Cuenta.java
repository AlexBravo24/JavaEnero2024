package com.modelo;

public class Cuenta {
	
	//EN EL PAQUETE COM.MODELO GUARDAMOS LA INFORMACION
	//DE LAS ENTIDADES U OBJETOS A LOS CUALES
	//QUEREMOS ACCEDER. PARA ESTE EJEMPLO CREAREMOS VARIAS
	//CUENTAS QUE ALMACENAREMOS EN UN HASMAP PARA
	//SIMULAR UNA PEQUEÑA BD
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipo;
	
	public Cuenta () {
		
	}

	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String tipo) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", tipo=" + tipo + "]";
	}
	
	

}
