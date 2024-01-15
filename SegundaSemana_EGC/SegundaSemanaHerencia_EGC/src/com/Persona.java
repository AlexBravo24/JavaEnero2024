package com;

public class Persona {

	// Esta clase va a ser nuestra Class padre o Super Class

	private String nombre;
	private String genero;
	private int edad;

	public Persona() {

	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

	// Metodos propios o comportamientos de los objetos
	// son acciones que nuestro objeto puede llevar a cabo

	// Metodo void ejecuta algo pero no regresar valores

	// Ejemplo de metodo para que una persona coma

	public void comer() {
		// Aqui definieremos la accion del mismo

		System.out.println("Estoy comiendo...");

	}

	// Ejemplo sobrecarga de metodo o creacion de un metodo polimorfico
	public void comer(String comida) {

		System.out.println("Estoy comiendo " + comida);

	}

	public void comer(int cantidad, String comida) {
		System.out.println("Estoy comiendo " + cantidad + " raciones de " + comida);
	}

	// Ejemplo metodo con retorno
	public String respirar() {
		String oxigeno = "Estoy respirando...";
		return oxigeno;

	}

	// el polimorfismo en metodos es cuando tenemos varias formas del metodo con el
	// mismo nombre
	// lo cual se conoce como sobrecarga de metodos
	// y esto va de la mano con la sobrecarga de elementos
	// es decir los datos que el metodo solicite para ejecutarse

}
