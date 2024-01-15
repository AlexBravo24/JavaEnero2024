package com;

public class Persona {
	
	//Esta es una clase que nos va a servir como 
	//plantilla para crear nuevos objetos Persona
	//Primero utilizaremos la ABSTRACCION para
	//modelar los atributos de mi objeto aqui
	
	//Atributos que tendira una persona
	//Existen lo que son los modificadores de acceso
	//Lo cual nos va a permitir encapsular, o proteger
	//la informacion
	//estos tienen diversos alcances
	//private, publc, protected y default
	//y se anteponen antes del tipo de tipo
	
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//METODOS CONTRUCTORES
	//Son metodos que permiten crear a nuestro objeto
	//con sus valores ya iniciados o los que necesitemos iniciar
	
	//Por lo general contamos con el uso de dos contructores
	//Constructor vacio, nos permite instanciar nuestro objeto
	//sin valores asignados
	//Este se vuelve como un "dummie" o comodin, con el cual podremos
	//asignar valores posteriormente con los metodos Setters 
    public Persona () {
	
}
    //Constructor con todos los parametros -Nos permite instanciar
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
	
	//Ejemplo de Constructor con solo 1 parametro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//METDOS GETTERS Y SETTER
	//GET, permite recuperar el valor de un atributo asignado
	//SET, nos permite establecer el valor de un atributo
	
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
	
	//Metodo toString ()
	//Nos va a permitir en Strgin todo los datos de nuestro objeto
	//de como se compone
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
    

}
