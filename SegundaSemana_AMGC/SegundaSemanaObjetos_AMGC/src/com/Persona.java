package com;

public class Persona {
	
	//Esta es una clase que nos va a servir como plantilla para crear nuevos objetos - persona
	//Primero utilizaremos la abstracci�n para modelar los atributos de mi objeto aqu�
	
	//Atributos que tendr�a una persona
	//Existen los modificadores de acceso, lo cual nos va a permitir encapsular o proteger el acceso
	//a la informaci�n.
	//Estos modificadores tienen diversos alcances y son:
	// private, public, protected y default
	//y se anteponen antes del tipo de dato
	
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//M�TODOS CONSTRUCTORES
	/* Son m�todos que nos van a permitir crear a nuestro objeto con sus valores ya iniciados
	 * o los que necesitemos iniciar.
	 * 
	 * Por lo general, contamos con el uso de dos constructores:}
	 */
	
	/* Contructor vac�o: que nos permite instanciar nuestro objeto sin valores asignados
	 * Este se vuelve como un "dummie" o comodin, con el cual podremos asignar valores
	 * posteriormente con los m�todos Setters
	 */
	public Persona() {
		
	}
	
	/*Constructor con todos los parametros:
	 * Nos permite instanciar o crear un nuevo objeto con sus valores asignados desde un inicio
	 * 
	 * �C�mo hacerlo?
	 * Click derecho + Source + Generate Constructor Using Fields
	 */
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
	
	//Ejemplo de constructores con solo un parametro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	//M�TODOS GETTERS Y SETTERS
	/* M�todo GET, nos permite recuperar el valor de un atributo asignado,
	 * M�todo SET, nos permite establecer el valor de un atributo.
	 * Click derecho + Source + Generate Getters y Setters
	 */
	
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
	
	
	
	//M�todo toString()
	//Nos va a permitir visualizar en String todos los datos de nuetro objeto, de como se compone
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	

}
