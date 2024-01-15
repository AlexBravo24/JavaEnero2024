package com;

public class Vendedor extends Empleado {
	
	private String comision;
	
	public Vendedor() {
		
	}

	public Vendedor(String nombre, String genero, int edad, String rfc, String puesto, double salario, String turno,
			String comision) {
		super(nombre, genero, edad, rfc, puesto, salario, turno);
		this.comision = comision;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [comision=" + comision + ", toString()=" + super.toString() + "]";
	}
	
	//Las clases que heredan una clase abstracta, tiene que

	@Override
	public void vender() {
		// TODO Auto-generated method stub
		System.out.println("Vendiendo...");
		
	}
	
	

}
