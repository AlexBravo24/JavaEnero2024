package com;

public class Vendedor extends Empleado{

	private double comision;
	
	public Vendedor() {
		
	}

	public Vendedor(String nombre, String genero, int edad, String rfc, String puesto, double salario, String turno,
			double comision) {
		super(nombre, genero, edad, rfc, puesto, salario, turno);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [comision: " + comision + ", toString()=" + super.toString() + "]";
	}

	//Las clases que heredan de una clase abstracta, tienen ue definir los metodos abstractos
	@Override
	public void vender() {
		System.out.println("Vendiendo...");
		
	}
	
	
	


}
