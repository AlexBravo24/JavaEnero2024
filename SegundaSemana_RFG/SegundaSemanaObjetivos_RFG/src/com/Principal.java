package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En POO,sólo debe de existir una clase main
		
		Alumno alumno = new Alumno();
		
		alumno.setNombre("Roberto");
		alumno.setEdad(26);
		alumno.setAltura(1.89);
		alumno.setEscuela("Escuela");
		alumno.setPeso(69);
		
		
		System.out.println(alumno.toString());
		
		//
	}

}
