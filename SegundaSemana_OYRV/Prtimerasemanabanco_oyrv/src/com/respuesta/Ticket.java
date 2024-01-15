package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//Vamos a modelar nuestro objeto de respuesta cuando las operaciones del cajero sean satisfactorias 
	
	private int folio;
	private Date fechaHora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHora, String usuario, double saldo, String sucursal, int idcajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
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

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	
	

}
