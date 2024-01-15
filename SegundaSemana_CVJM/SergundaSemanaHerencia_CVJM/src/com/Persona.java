package com;

public class Persona {
//Esta clase va a ser nuestra clase PADRE o SUPERCLASE
	private String nombre;
	private String genero;
	private int edad;
	
	//Creamos constructor vacio
	
	public Persona() {
		
	}
	//Creamos constructor con todos los parametros

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	//Creamos constructor Getters y Setters
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
	//Creamos constructor to String (PARA PODER VISUALIZAR
	//SUS ATRUBUTOS EN CONSOLA)
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//METODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
	/*Son acciones que nuestro objeto puede llevar a cabo:
	 * bañarse, caminar etc
	 * 
	 * Existen dos formas que tengan metodos propios para 
	 * llevar acciones a cabo los objetos
	 * 
	 * <<METODO VOID>>
	 * Metodo que ejecuta algo, pero no debe 
	 * retornar algun valor de un tipo de dato
	 * 
	 * Ejemplo: crear un metodo para que una persona pueda 
	 * comer
	 * 
	 * Aviso: Se declara en la clase "Persona", eso quiere decir 
	 * que esta accion la va a poder ejecutar una Persona 
	 * creada en la clase "Principal"
	 * 
	 */
	
	
	public void comer () {
		//Aqui definiremos la accion del metodo
		System.out.println("Estoy comiendo...");
	}
	//<CREACION DE UN METODO POLIMORFICO>
	public void comer(String comida) {
		System.out.println("Estoy comiendo "+comida);
	}
	//CREANDO UN METODO MAS DE COMER 
	//Cuando se crean varios metodos con el mismo nombre: sobre carga
	//de metodos
	public void comer(String comida, int cantidad) {
		//(sobre carga de argumentos)
		System.out.println("Estoy comiendo "+cantidad+ " raciones de "+comida);
	}
	/*POLIMORFISMO EN MÉTODOS
	 * Es cuando tenemos varias formas del metodo con el mismo nombre ,
	 * lo cual se conoce como sobrecarga de metodos
	 * 
	 * y esto va de la mano con la sobrecarga de argumentos, es decir,
	 * los datos que el metodo solicite para ejecutarse
	 */
	
	
	
	
	//<<METODO CON RETORNO DE TIPO DE DATO>>
	/*Escribimos
	 * modificador (public) + el tipo de dato que queremos que regrese (String,
	 * int, double) + accion (){}
	 * 
	 * poner el cursor en respirar si aparece en rojo y elegir:
	 * "Add return statement" 
	 *
	 *Va a retornar "genero" pero se puso "null" provisionalmente
	 *Declaro un String antes del retorno llamado "oxigeno"
	 *
	 *El mensaje del oxigeno "Estoy respirando" la vamos a regresar
	 *intercambiando "null" por "oxigeno" 
	 */
	
	public String respirar () {
		String oxigeno= "Estoy respirando";
		//Tambien podemos poner imprimir en esta clase de la sig manera
		System.out.println(oxigeno);
		return oxigeno;
		
		//Cuando en la clase Principal sea llamado el metodo respirar 
		// sera equivalente a que se traiga el mensaje "Estoy respirando"
		// si se imprime
	}
	
	
}
