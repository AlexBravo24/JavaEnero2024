package com;

public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma de " + a + "+" + b +" = " + (a+b));
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("La resta de " + a + "-" + b +" = " + (a-b));
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("La multiplicacion de " + a + "x" + b +" = " + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("La division de " + a + "/" + b +" = " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}

}
