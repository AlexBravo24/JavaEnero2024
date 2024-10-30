package com;
//LA HERENCIA se realiza con la palabra reservada "extends"
//Poner "extends" despues de la clase, seguido de la clase Padre (en este caso Persona)
public abstract class Empleado extends Persona{

	//Esta va a ser una clase hija, que heredara los 
	//atributos de la clase Persona
	
	private String rfc;
	private String puesto;
	private double salario;
	private String turno;
	
	//Creamos contructor vacio
	public Empleado() {
		
	}

	//Creamos contructor con todos los parametros 
	//+Cambiar en la parte superior (Seleccionar super constructor)
	//que tambien tengan los datos de la clase Padre (Persona)
	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.salario = salario;
		this.turno = turno;
	}
	
	//Creamos Gettels y Settels

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	//Crear to String 
	//+ Agregamos en Inthered methods = To String (para seleccionar todas las 
	//caracteristicas de la clase Padre

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", salario=" + salario + ", turno=" + turno
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	//METODOS PROPIOS DE LA CLASE EMPLEADO 
	//Empleado tiene acciones: 3 formas de comer y 1 de respirar 
	//Pero todos los empleados pueden tener esta accion:
	
	public void checarEntrada() {
		//Entonces haremos que todos lo empleados cuando ejecuten "checarEntrada"
		//hagan lo siguiente:
		System.out.println("Iniciando turno...");
		//Cada vez que hagamos un empleado, vendedor (nieta) etc haran esta accion
	}
	
	//***ESTA CLASE SE CONVERTIRA EN ABSTRACTA***	
	//METODO ABSTRACTO- Es aque que define que se hace pero no como se hace
	public abstract void vender (); //En vez de abrir una llave para definir como se 
	//ejecutar la accion, terminamos con ; ya que es un METODO abstracto 
	//1. Posicionarse y elegir "make abstract" y se agregara la palabra "abstract" 
	//2. Posicionarse y elegir convertir la clase 'Empleado' en abstracta 
	// debido a que un metodo abstracto se encuentra en una clase abstracta
	// y se agrego la palabra "abstract" arriba 
	
	//***ERROR EN PRINCIPAL
	//CLASE EMPLEADO CONVERTIDA EN ABSTRACTA 
	//Una clase abstracta no puede generar objetos
	//Empleado desarrollador= new Empleado(); <-- no se puede (esta en principal 
	//comentadas)
	
	//***ERROR EN VENDEDOR
	//Aparece un error en la clase, pero no se puede convertir en abstract 
	//porque si no no se podrian crear mas clases 'Vendedor' y si queremos mas 
	//vendedores asi que debemos 'Agregar los methodos no implememtados'
	//Y al final se sobrescribe @Overrride
	
	
	/*HACER ABSTRACTAS LAS CLASES PARA LAS COSAS BASICAS para que las otras clases
	 * heredadas las ocupen de manera especializado.
	 * 
	 */
}
