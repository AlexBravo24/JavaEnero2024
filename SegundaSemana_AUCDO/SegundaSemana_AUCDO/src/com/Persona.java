package com;

public class Persona {

	//Esta clase va servir de plantilla para crear nuevos objetos del tipo personsa
	// Con el metodo abstraccion
	
	
	//Atributos generales de una persona
	//Modificadores de acceso nos permite ENCAPSULAR o proteger
	//el acceso a la informacion, estos tienen diversos alcnces y se conocen como
	//private, publiuc protected y default
	//y se ponen antes del tipo de dato
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;

	//METODOS CONSTRUCTORES
	//Estos nos permiten crear a nuestro objeto con valores ya iniciados o 
	//los que necesitemos iniciar
	
	//Contamos con el uso de algunos consructores
	//Constructores vacios que nos permite  instanciar nuestro objeto
	//sin valores asignador
	//Este se vuelve un comodin con el cual podemos agregar valores con los metodos Setters
	public Persona() {
		
	}
	
	//Constructor con todos los parametros
	//Nos permite instanciar o crear nuevo objeto 
	//con todos los parametros desde un inicio
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}

	//Constructor con un parametro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	//METODOS GETTERS Y SETTERS
	//GET nos permite recuperar el valor de un atributo asignado
	//SET nks permite establecer el valor de un atributo
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
	
	
	//Nos permite ver todos los atrivutos de los cuales se compone nuestro objetos
	//Nos permite visualizar como String todos esos datos 
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}	
	
	
	
	
	
}
