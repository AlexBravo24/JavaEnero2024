package com;

public class Persona {

	/* Esta es una clase que nos va a servir como plantilla 
	 * para crear nuevos objetos Persona 
	 * 
	 * Primero utilizaremos la ABSTRACCION para modelar 
	 * los atributos de mi objeto aqui:nobre, edad, nacionalidad etc.
	 * 
	 * 
	 * Atribubutos que tendrían una perosna
	 * Existen lo que son los modificadores de acceso
	 * lo cual nos va a permitir ENCAPSURLAR o proteger el
	 * acceso a la informacion
	 * 
	 * Estos modificadores tienen diversonas alcances:
	 * private, public, protected y default
	 * y se anteponen antes del tipo de dato
	 * **Si no se ponen modificadores de acceso es default
	 */
	
	private String nombre;
	private int edad;
	private String nacionalidad;
	private double altura;
	private double peso;
	
	//METODOS CONSTRUCTORES
	/*Son metodos que nos van a permitir crear a nuestro 
	 * objeto con sus valores ya iniciados o los que
	 * necesitemos iniciar
	 * 
	 * Por lo general contamos con el uso de dos 
	 * constructores vacios
	 * Primero el constructor vacio, que nos permite instanciar/
	 * iniciar nuestro objeto sin valores asignados
	 * 
	 * CONSTRUCTOR VACIO
	 * Nos permite crear una nueva persona en principal
	 * Persona persona1= new Persona();
	 * Sin asignarle valores a sus atributos
	 * 
	 * Nos permite crear una nueva persona (declararla) sin asignarle
	 * aun atributos
	 * 
	 * Este se vuelve como un "dummie" o comodin, con el cual podremos 
	 * asignar valores posteriormente con los metodos Setters 
	 */
	public Persona () {
		
	}

	//CONSTRUCIOR CON TODOS LOS PARAMETROS
	/*nos permite instanciar o crear un nuevo objeto con sus valores (atributos)
	 * asignados desde un inicio 
	 * 
	 * Indica que lo que se escriba como "nombre" arriba se va a guardar aqui
	 */
	public Persona(String nombre, int edad, String nacionalidad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.altura = altura;
		this.peso = peso;
	}

	//Construcor con solo un parametro (atributo)
	//Mayormente los contructores son tipo publico
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/*METODOS GETTERS Y SETTERS
	 * Get: recuperar el valor de un atributo asignado
	 * Set: establecer el valor del parametro (atributo) cuando los 
	 * atributos son privados
	 * 
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

	//toString: permite convertir todos los valores (atributos) a 
	//formato cadena (String)
	//Sobreescribe los valores convertidos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	

	
	
	
	
	
	
}
