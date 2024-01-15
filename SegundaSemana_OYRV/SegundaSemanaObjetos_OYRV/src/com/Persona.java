package com;

public class Persona {
	
	// esta es un clase que nos va a servir como plantilla para crear nuevos objetos Persona, primero utilizaremos la abstraccion para modelar los atributos de mi objeto aqui 
	// atributos que tendria una persona 
	//existen lo que son los modificadores de acceso, lo cual nos va a permitir encapsular o proteger el acceso a la informacion 
	//estos modificadores tienen diversos alcances (private,public,protected y default) y se anteponen antes del tipo de dato
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//METODOS CONSTRUCTORES: son metodos que nos van a permitir crear a nuestro objeto con sus valores ya iniciados o los que necesitemos iniciar 
	
	//por lo general contamos con el uso de dos constructores
	//constructor vacio, nos permite instanciar nuestro objeto sin valores asignados
	// este se vuelve como un "dummie" o comodin, con el cual podemos asignar valores posteriormente con los metodos setters
	public Persona () {
		
	}
	
	//constructor con todfos los parametros - nos permite instanciar o crear un nuevo objeto con sus valores asignados desde un inicio 

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
	
	//METODOS GETTERS Y SETTERS: metodo GET nos permite recuperar el valor de un atributo asignado, metodo SET nos permite establecer el valor de un atributo

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
	
	//metodo TOSTRING nos va a permitir visualizar en String todos los datos de nuestro objeto de como se compone

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	

	
	
	
	
	
	

}
