package com;

import java.util.Scanner;


public class Cientifica extends Calculadora implements ITermometro {
	
	Scanner entrada = new Scanner(System.in);
	
	private boolean celdasolar;
	private boolean integrar;
	private boolean derivar;
	
public Cientifica () {
		
	}

	public Cientifica(String marca, double precio, String color, boolean celdasolar, boolean integrar,
		boolean derivar) {
	super(marca, precio, color);
	this.celdasolar = celdasolar;
	this.integrar = integrar;
	this.derivar = derivar;
}







	public boolean isCeldasolar() {
		return celdasolar;
	}





	public void setCeldasolar(boolean celdasolar) {
		this.celdasolar = celdasolar;
	}





	public boolean isIntegrar() {
		return integrar;
	}





	public void setIntegrar(boolean integrar) {
		this.integrar = integrar;
	}





	public boolean isDerivar() {
		return derivar;
	}





	public void setDerivar(boolean derivar) {
		this.derivar = derivar;
	}

	@Override
	public String toString() {
		return "Cientifica [entrada=" + entrada + ", celdasolar=" + celdasolar + ", integrar=" + integrar + ", derivar="
				+ derivar + ", toString()=" + super.toString() + "]";
	}


	@Override
	public void sumar() {
		System.out.println("ingrese el primer numero");
		double numero1 = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		double numero2 = entrada.nextInt();
		System.out.println("el resultado es " + (numero1 + numero2));
		
	
		
	}

	@Override
	public void restar() {
		System.out.println("ingrese el primer numero");
		double numero1 = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		double numero2 = entrada.nextInt();
		System.out.println("el resultado es " + (numero1 - numero2));	
		
	}

	@Override
	public void multiplicar() {
		System.out.println("ingrese el primer numero");
		double numero1 = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		double numero2 = entrada.nextInt();
		System.out.println("el resultado es " + (numero1 * numero2));
		
	}

	@Override
	public void dividir() {
		System.out.println("ingrese el primer numero");
		double numero1 = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		double numero2 = entrada.nextInt();
		System.out.println("el resultado es " + (numero1 / numero2));
		
	}
	
	public void tomarTemperatura() {
	 System.out.println("temperatura normal");
	}

	
	

}
