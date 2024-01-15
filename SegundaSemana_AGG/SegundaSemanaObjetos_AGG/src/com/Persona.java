package com;

public class Persona {
	
	//esta es una clase que nos va a servir como
	//plantilla para crear nuevos objetos Persona
	//primero utilizaremos la ABSTRACCION para
	//modelar los atributos de mi objeto aquí
	
	//Atributos que tendria una persona
	//Existen lo que son los modificadores de acceso
	//lo cual nos va a permitir ENCAPSULAR o proteger
	//el acceso a la informacion
	//estos modificadores tienen diversos alcances 
	//Private, public, protected y default
	//y se interponen antes del tipo de dato
	
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//METODOS CONSTRUCTORES
	//Son metodos que nos van a permitir crear a nuestro objeto
	//con sus valores ya iniciados o los que  necesitemos iniciar
	
	//por lo general contamos con el uso de contructores
	//constructor vacío, que nos permite instanciar nuestro objeto
	//sin valores asignados.
	//asignar valores posteriormente con los metodos Setters
	public Persona() {

	}
	//constructor con todos los parametros - nos permite instanciar
	//o crear un nuevo objeto con sus valores asignados desde
	//un inicio
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
	
	//Ejemplo de constructor con solo un parametro (nombre)
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//METODOS GETTERS Y SETTERS
	//Metodo GET, nos permite recuperar el valor de un archivo asignado
	//Metodo SET, nos permite establecer el valor de un atributo
	
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
	
	//clic derecho--> Sourse --> Generar toString
	//Metodo toString()
	//nos va a permitir visualizar un String todos los datos de nuestro objeto
	//de como se compone
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

	

}
	
	
	
