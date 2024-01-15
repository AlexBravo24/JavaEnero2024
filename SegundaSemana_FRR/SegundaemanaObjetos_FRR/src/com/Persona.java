package com;

public class Persona {

	//Esta es una clase que nos va a servir como plantilla para crear nuevos
	//objetos persona
	//primero usaremos la abstraccion para modelar los atributos aqui
	
	//atributos que tendría una persona
	
	//existen lo que se llaman modificadores de acceso
	//lo cual nos va a permitir encapsular o proteger el acceso a la informacion
	//private, public, protected y default
	//se anteponen antes del tipo de dato
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//metodos constructores
	//son metodos que nos van a permitir construir a nuestro objeto
	//con sus valores ya iniciados o que necesitemos iniciar
	
	//por lo general contamos con el uso de dos constructores
	//constructor vacio que nos permite instanciar nuestro objeto sin 
	//valores asignados
	//se vuelve comodin 
	public Persona () {
		
	}
//constructor con todos los parametros. Nos permite intanciar o crear
	//todos los parametros desde un inicio
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//~~~~~Metodos getters y setters~~~~~~~~~
	//metodo GET nos permite recuoerar el valor de un atributo asignado
	//metodo SET nos permite asignar el valor a un atributo
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
	
	
	//metodo tostring nos permite visualizar en string todos los datos de nuestr objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

	
	
	}
	
	
	

