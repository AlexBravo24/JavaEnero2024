package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calc1 = new Cientifica("Casio", "gris", 13, 4520, "B�sico, Financiero", "Estuche");
		System.out.println(calc1);
		
		switch (calc1.operacion()) {
		case 1:
			calc1.sumar(calc1.numero1(), calc1.numero2());
			break;
		case 2:
			calc1.restar(calc1.numero1(), calc1.numero2());
			break;
		case 3:
			calc1.multiplicar(calc1.numero1(), calc1.numero2());
			break;
		case 4:
			calc1.dividir(calc1.numero1(), calc1.numero2());
			break;
		default:
			System.out.println("Ingrese el n�mero de una operaci�n disponible");
			break;
		}
		
		calc1.tomarTemperatura();
		
		//�De d�nde toman comportamientos los objetos?
		//1. M�todos propios
		//2. De otras clases, incluyendo abstractas
		//3. Interfaces
		
	}

}
