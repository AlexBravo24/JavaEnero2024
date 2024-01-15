package com;

public class Persona {

	/*Esta es una clase que nos va servir 
	 * como plantilla para crear nuevos objetos persona
	 * Primero utilizaremos la ABSTRACCION para
	 * modelar los atributos de mi objeto aqui
	 * 
	 * ATRIBUTOS QUE TENDRIA UNA PERSONA
	 * Existen los modificadores de acceso
	 * lo cual nos va a permitir encapsular o proteger
	 * el acceso ala informacion
	 * Tienen diversos alcanzes
	 * private, public, protected y default
	 * y se anteponen antes del tipo de dato*/
	
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	/*METODOS CONSTRUCTORES
	 * Son metodos que nos van a permitir crear nuestro objeto
	 * con sus valores ya iniciados alos uqe necesitemos iniciar
	 * 
	 * Por lo genral contamos con el uso de dos constructores
	 * constructor vacio. que nos permite instanciar nuestro objeto
	 * sin valores iniciados*/
	
	public Persona() {
		/*Este se vuelve como un dommmie o comodin con el cual 
		 * podremos asignar valore posteriormente con los
		 * metodos setters.*/
		
	}
	//constructor con todos los parametros. nos permite instanciar
	//o crear un nuevo objetocon sus valores asignados desde
	//un inicio
	//(NUMERO 1)
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}
	//Ejemplo de constructor con solo un parametro
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	//METODOS GETTERS Y SETTERS
	//Metodo GET, recupera el valor d eun atributoasignado
	//Metodo SET, Nos permite establecer el valor de un atributo
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
	/*Metodo toString
	 * Nos va a permitir visualizar en string todos los datos de nuestro ob
	 * objeto y sus atributos*/
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
