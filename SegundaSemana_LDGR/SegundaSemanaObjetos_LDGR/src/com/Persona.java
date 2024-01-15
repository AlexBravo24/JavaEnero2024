package com;

public class Persona {
	// Esta es una clase que nos va a servir como plantilla
	// para crear nuevos objetos "Persona"
	
	// Primero utilizaremos la ABSTRACCIÓN para modelar
	// los atributos de mi objeto aquí
	
	// Atributos que tendría una persona
	
	// Existen lo que son los modificadores de acceso, lo cual
	// nos va a permitir ENCAPSULAR o proteger el acceso
	// a la información
	// Estos modificadores tienen diversos alcances
	// private, public, protected y default
	// y se anteponen antes del tipo de dato
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	// MÉTODOS CONSTRUCTORES
	// Son métodos que nos van a permitir crear a nuestro Objeto
	// con sus valores ya iniciados o los que necesitemos iniciar
	
	// Por lo general, contamos con el uso de dos constructores:
	
	// Constructor vacío, que nos permite instanciar nuestro Objeto
	// sin valores asignados
	
	// Este Constructor vacío se vuelve como un "dummie" o comodín,
	// con el cual podremos asignar valores posteriormente con los
	// métodos Setters
	public Persona() {
		
	}
	
    // Constructor con todos los parámetros - Nos permite instanciar
	// o crear un nuevo Objeto con sus valores asignados desde un inicio.
	
	// Clic derecho -> Source -> Generate Constructor using Fields...
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}

	// Ejemplo de Constructor con UN solo parámetro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
    //MÉTODOS GETTERS Y SETTERS
	// Método GET, nos permite recuperar el valor de un atributo asignado
	// Método SET, nos permite establecer el valor de un atributo
	
	// Clic derecho -> Source -> Generate Getters and Setters...
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método toString()
	// Nos va a permitir visualizar en String todos los datos de 
	// nuestro Objeto
	
	// Clic derecho -> Source -> Generate toString()...
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
 
}
