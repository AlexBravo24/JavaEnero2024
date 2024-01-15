package com;

public class Persona {
	/*Esta clase va hacer nuestra clase
	 * padre o superclase*/
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	/*METODOS PROPIOS O COMPORTAMIENTO DE LOS OBJETOS
	 * Son acciones que nuestro objeto puede llevar acabo
	 * 
	 * METODO VOID- Metodo que ejecuta algo pero no debe retornar ningun valor
	 * de un tipo de dato
	 * 
	 * Ejemplo crear un metodo para que una persona pueda comer*/
	
	public void comer() {
		//Aqui definiremos la accion del mismo
		System.out.println("Estoy comiendo....");
	}
	//METODO CON RETORNO DE TIPO DE DATO
	public String respirar() {
		String oxigeno = "Estoy respirando";
		System.out.println(oxigeno);
		return oxigeno;
		
		
	}
	
	/*CREACION DE UN METODO POLIMORFICO*/
	
	public void comer(String comida) {
		
		System.out.println("Estoy comiendo "+ comida);
	}
	//OTRO METODO MAS CON COMER
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo "+cantidad+" raciones de "
				+comida);
		/*Polimorfismo en metodos, es cuando tenemos varias formas del metodo
		 * con el mismo nombre, lo cual se conoce s¿como sobre carga de metodos
		 * 
		 * y esto va de la mano con la sobre carga de argumentos, es decir, los
		 * datos que el metodo solicite para ejecutarse*/
	}
	

}
