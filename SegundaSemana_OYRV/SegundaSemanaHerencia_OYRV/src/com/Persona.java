package com;

public class Persona {
	
	//esta clase va a ser nuesta clase Padre o superclase 
	
	private String nombre;
	private String genero;
	private String edad;
	
	public Persona () {
		
	}

	public Persona(String nombre, String genero, String edad) {
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	//Metodos propios o comportamientos de los objetos, son acciones que nuestro objeto puede llevar acabo 
	
	// metodo void que ejecuta algo pero no debe retornar un tipo de dato 
	//ejemplo, crear un metodo para que una persona pueda comer 
	
	public void comer() {
		//aqui definiremos la accion del mismo 
		System.out.println("Estoy Comiendo...");
	}
	
	//metodo con retorno de tipo de dato 
	public String respirar() {
		String oxigeno = "estoy respirando";
		return oxigeno;
		
	}
	
	//creacion de un metodo polimorfico
	public void comer(String comida) {
		System.out.println("Estoy Comiendo" + comida);
	}
	
	//CREANDOUN METODO MAS DE COMER
	public void comer(String comida, int cantidad) {
		System.out.println("estoy comiendo " +  cantidad + " raciones de " + comida);
		
	}
	
	//polimorfismo en metodos, es cuando tenemos varias formas del metdo con el mismo nombre, lo cual se conoce como sabre carga de metodos y esto va de la mano con la sobrecarga de argumentos es decir los datos que el metodo solicite para ejecutarse.
	
	
	

}
