package com;

public class Persona {
	
	//Esta clase va a ser nuestra clase Padre o superclase
	
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
	
	
	//MÉTODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
	//Son acciones que nuestro objeto puede llevar a cabo
	
	//MÉTODO VOID - ejectua algo, pero no debe retornar algun valor de un tipo de dato
	//Ejemplo, crear un método para que una persona pueda comer
	
	public void comer() {
		
		//Aqui definiremos la accion del mismo
		System.out.println("Estoy comiendo...");
	}
	
	//MÉTODO CON RETORNO DE TIPO DE DATO
	public String respirar() {
		String oxigeno = "Estoy respirando";
		return oxigeno;
	}
	
	//CREACIÓN DE UN MÉTODO POLIMÓRFICO
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
	
	//CREANDO UN MÉTODO MÁS DE COMER
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo " + cantidad + " raciones de " + comida);
	}
	
	//POIMORFISMO EN MÉTODOS, es cuando tenemos dormas del método con el mismo nombre,
	//lo cual se conoce como sobrevarga de métodos
	
	//Y esto va de la mano con la sobrecarga de argumentos, es decir, los datos que
	//el método solicite para ejecutarse.
	

}
