package com;

public class Persona {
	// Esta es una clase que nos va a servir como plantilla para crear
	// nuevos objetos Persona.
	// Primero utilizaremos la ABSTRACCIÓN para modelar
	// los atributos de mi objeto aquí
	
	// Atributos que tendría una persona
	//Existen los modificadores de acceso lo cual nos va a permiti
	//ENCAPSULAR o proteger el acceso a la informacion
	//Estos tienen diversos alcances
	// private, public, protected y default
	// y se antenponen antes del tipo del dato
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//METODOS CONSTRUCTORES
	//Son metodos que nos van a pemitir crear nuestro objeto
	// con sus valores ya iniciados o los que necesitemos iniciar
	
	//Por lo general contamos con el uso de 2 consutructures
	//Constructor vacio, que nos permite instanciar nuestro objeti
	// sin valores asignados
	
	public Persona() { //Este se vuelce como un "dummie" o comodín
		//Para despues asiganle valores con los metodos
		//Setters y Getters
	}
	//CONSTRUCTOR CON TODOS LOS PARAMETROS - no permite
	//Instanciar o crear un nuevo objeto con sus valores
	//asignados desde un inicio
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
	
	//CONSTRUCTOR con solo nombre
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//ESTOS son los metodos GETTERS Y SETTERS
	//Metodo GET nos permite RECUPERAR EL VALOR de un atributo asignado
	//Metodo SET nos permite ESTABLECER EL VALOR de un atributo
	
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
	
	//METODO TO STRING para convertir todos los valores a String
	//EL metodo toString nos va permitir visualizar en String todos losdatos
	//de como se compone nuestro objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
