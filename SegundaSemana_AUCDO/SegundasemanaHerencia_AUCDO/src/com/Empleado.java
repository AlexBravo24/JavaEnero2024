package com;

//La herencia se realiza con la palabra reservada EXTENDS
public abstract class Empleado extends Persona{
	
	//Esta sera la clase hija, que hereda de clase persona
	private String rfc;
	private String puesto;
	private double salario;
	private String turno;

	
	public Empleado () {
		
	}


	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.salario = salario;
		this.turno = turno;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	@Override
	public String toString() {
		return "Empleado [rfc: " + rfc + ", puesto: " + puesto + ", salario: " + salario + ", turno: " + turno
				+ ", toString()=" + super.toString() + "]";
	}
	
	//Metodos propios de la esta clase
	
	public void checarEntrada() {
		System.out.println("Inicia turno");
	}

	// METODO ABSTRACTO - ES AQUEL QUE DEFINE QUE SE HACE PERO NO COMO SE HACE
	public abstract void vender();
	
	
	
}
