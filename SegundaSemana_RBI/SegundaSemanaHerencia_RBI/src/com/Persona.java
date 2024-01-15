package com;

public class Persona {
	
	//Esta clase va a ser nuestra clase Padre o superclase
	
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
	
	//METODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
	//Son acciones que nuestro objeto puede llevar acabo
	
	//METODO VOID- Metodo que ejecuta algo, pero no debe retornar algun valor de un tipo de dato
	
	//Ejemplo, crear un metodo para que una persona pueda comer 
	
	public void comer() {
		//Aqui definiremos la accion del mismo
		System.out.println("Estoy comiendo....");
	}
	
	//Metodo  con retorno de tipo de Dato
	public String respirar() {
		String oxigeno ="Estoy respidando";
		return oxigeno;
		
	}
	
	//Creacioni de un metodo Polimorfico 
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
		
	}
	
	//creando un metodo mas de comer
	public void comer(String comida, int capacidad) {
		System.out.println("Estoy comiendo " + capacidad + " raciones de " + comida);
	}
	
	//Polimorfismo en metodos, es cuando tenemos varias formas del metodo con el mismo nombre
	//lo cual se conoce como sobrecarga de metodos
	
	//Y esto va de la mano con la sobrecarga de argumentos, es decir, los datos 
	//que el metodo solicite para ejecutarse
	
	
	

}
