package com;

public class Persona {

	//esta clase va a ser nuestra clase padre o superclase
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {
		
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
	
	//Metodos propios o comportamientos 
	//son acciones que nuestro objeto puede llevar a cabo
	
	//Metodo void - Metodo que ejecuta algo pero no debe 
	//retornar ningun tipo de dato
	
	//ejemplo crear un metodo para que una persona pueda comer
	
	public void comer() {
		//definiremos la accion del mismo
		System.out.println("Estoy comiendo...");
	}
	
	//METODO CON RETORNO DE TIPO DE DATO
	 public String respirar ( ) {
		String oxigeno = "estoy respirando";
		System.out.println(oxigeno);
		 return oxigeno;
		 
		 
		 
	 }
	 
	 //creacion de un elemento polimorfico
	 public void comer(String comida) {
		 System.out.println("estoy comiendo" + comida);
	 }
	 
	 public void comer(String comida, int cantidad) {
		 System.out.println("estoy comiendo " + cantidad + " raciones de "+ comida);
	 }
	 
	 //EL POLIMORFISMO EN METODOS ES CUANDO TENEMOS VARIAS FORMAS DEL METODO
	 //CON EL MISMO NOMBRE, LO CUAL SE CONDUCE COMO SOBRECARGA DE METODOS
	 
	 //ESTO VA DE LA MANO CON LA SOBRECARGA DE ARGUMENTOS, ES DECIR, LOS ELEMENTOS
	 //QUE EL METODO SOLICITE PARA EJECUTARLOS
	
}
