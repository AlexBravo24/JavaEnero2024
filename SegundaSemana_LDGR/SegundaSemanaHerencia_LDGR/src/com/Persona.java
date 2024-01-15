package com;

public class Persona {
	
	// Esta clase va a ser nuestra Clase Padre o Superclase
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		// Constructor vac�o
	}

	// Constructor con todos los par�metros
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	// Getters y Setters
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

	// M�todo toString()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	// M�TODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
	// Son acciones que nuestro Objeto puede llevar a cabo
	
	// M�TODO VOID - M�todo que ejecuta algo, pero no debe retornar
	// alg�n valor de un tipo de dato
	
	// Ejemplo: crear un m�todo para que una persona pueda comer
	
	public void comer() {
		// Aqu� definiremos la acci�n del mismo
		System.out.println("Estoy comiendo...");
	}
	
	// M�TODO CON RETORNO DE TIPO DE DATO
	public String respirar() {
		String oxigeno = "Estoy respirando";
		return oxigeno;
		
	}
	
	// CREACI�N DE UN M�TODO POLIM�RFICO
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
		
	// CREANDO UN M�TODO M�S DE COMER
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo " + cantidad + " raciones de " + comida);
		}
	
	// POLIMORFISMO EN M�TODOS, ES CUANDO TENEMOS VARIAS FORMAS DEL M�TODO
	// CON EL MISMO NOMBRE, LO CUAL SE CONOCE COMO SOBRECARGA DE M�TODOS
	
	// Y ESTO VA DE LA MANO CON LA SOBRECARGA DE ARGUMENTOS, ES DECIR, LOS
	// DATOS QUE EL M�TODO SOLICITE PARA EJECUTARSE
		
	}


