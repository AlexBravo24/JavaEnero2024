package com;

public class Persona {
	
	//Esta clase va ser la clase padre o superclase
	
	private String nombre; 
	private String genero;
	private int edad;
	
	public Persona () {
		
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
	
	//METODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJTEVOS
		//Son acciones que nuestro objeto puede llevar a cabo
		
		//METODO VOID -Metodo que ejecuta algo pero no debe
		//retornar algun valor de un tipo de dato
		
		//Ejemplo, crear un metodo para que una persona pueda comer
		
		public void comer () {
			
		//Aqui definiremos la accion del mismo metodo
		System.out.println("Estoy comiendo...");
			
	}
		
		//METODO CON RETORNO DE TIPO DE DATO
		
		public String respirar() {
			String oxigeno = "Estoy respirando";
			
			return oxigeno;
			
		}
		
		//CREACION DE UN METODO POLIMORFICO
		public void comer(String comida) {
			System.out.println("Estoy comiendo " + comida);
		}	
		//CREANDO UN METODO MAS DE COMER
		public void comer(String comida, int cantidad) {
			System.out.println("Estoy comiendo " + cantidad + " raciones de " + comida);
			
			
		}
		
		//POLIMORFISMO EN METODOS, ES CUANDO TENEMOS VARIAS FORMAS DEL METODO
		//CON EL MISMO NOMBRE, LO CUAL SE CONOCE COMO SOBRECARGA DE METODOS 
		
		//Y ESTO VA DE LA MANO CON LA SOBRECARGA DE ARGUMENTOS, ES DECIR , LOS DATOS
		//QUE EL METODO SOLICITE EJECUTARSE
		}

