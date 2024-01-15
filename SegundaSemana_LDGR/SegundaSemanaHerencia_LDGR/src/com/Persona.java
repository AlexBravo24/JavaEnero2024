package com;

public class Persona {
	
	// Esta clase va a ser nuestra Clase Padre o Superclase
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		// Constructor vacío
	}

	// Constructor con todos los parámetros
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

	// Método toString()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	// MÉTODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
	// Son acciones que nuestro Objeto puede llevar a cabo
	
	// MÉTODO VOID - Método que ejecuta algo, pero no debe retornar
	// algún valor de un tipo de dato
	
	// Ejemplo: crear un método para que una persona pueda comer
	
	public void comer() {
		// Aquí definiremos la acción del mismo
		System.out.println("Estoy comiendo...");
	}
	
	// MÉTODO CON RETORNO DE TIPO DE DATO
	public String respirar() {
		String oxigeno = "Estoy respirando";
		return oxigeno;
		
	}
	
	// CREACIÓN DE UN MÉTODO POLIMÓRFICO
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
		
	// CREANDO UN MÉTODO MÁS DE COMER
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo " + cantidad + " raciones de " + comida);
		}
	
	// POLIMORFISMO EN MÉTODOS, ES CUANDO TENEMOS VARIAS FORMAS DEL MÉTODO
	// CON EL MISMO NOMBRE, LO CUAL SE CONOCE COMO SOBRECARGA DE MÉTODOS
	
	// Y ESTO VA DE LA MANO CON LA SOBRECARGA DE ARGUMENTOS, ES DECIR, LOS
	// DATOS QUE EL MÉTODO SOLICITE PARA EJECUTARSE
		
	}


