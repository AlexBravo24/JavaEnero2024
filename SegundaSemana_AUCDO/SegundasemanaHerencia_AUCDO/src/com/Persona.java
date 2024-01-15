package com;

public class Persona {

	//Esta sera la clase padre/super clase
	
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
		return "Persona [nombre: " + nombre + ", genero: " + genero + ", edad: " + edad + "]";
	}
	
	//Metodos propios o comportamientos de los OBJETOS
	//Acciones que nuestro objeto puede llevar acabo
	
	//METODO VOID - Metodo que ejecuta algo, pero no debe
	//retornar algun valor
	//Ejemplo, crear un metodo para que una persona puede comer
	
	public void comer() {
		//Aqui definiremos la accion del mismo
		System.out.println("Estoy comiendo...");
	}
	
	//Metodo con retorno de tipo de dato
	public String respirar() {
		String oxigeno = "Estoy respirando...";
		System.out.println(oxigeno);
		return oxigeno;
	}
	
	//Creacion de metodo polimorfico 
	public void comer(String comida) {
		System.out.println("Estoy comiendo "+comida);
	}
	
	//Creacion de metodo polimorfico CON SOBRECARGA de argumentos
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo "+cantidad+" porciones de "+comida);
	}
	
	//El polimorfimos en metodos es cuando tenemos varias formas del metodo con el mismo nombre
	//y se le conoce como sobre carga
	
	
}
