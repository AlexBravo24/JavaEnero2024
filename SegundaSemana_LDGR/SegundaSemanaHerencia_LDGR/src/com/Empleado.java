package com;

// LA HERENCIA se realiza con la palabra reservada "extends"
public abstract class Empleado extends Persona {
	
	// Esta va a ser una Clase Hija, que heredar� sus atributos
	// de la Clase Persona
	
	private String rfc;
	private String puesto;
	private double salario;
	private String turno;
	
	public Empleado() {
		// Constructor vac�o
	}

	
	// Generar el constructor con todos los par�metros
	// Clic derecho -> Source -> Generate constructor using fields...
	// y un paso adicional, cuando nos aparezca el cuadro emergente, 
	// en la parte de arriba, donde dice "Select super constructor 
	// to invoke", NO seleccionar la opci�n que tenga los par�ntesis 
	// vac�os, sino que los que tengan dentro los atributos de la Clase Padre
	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.salario = salario;
		this.turno = turno;
	}


	// Getters y Setters (se crean normal: Clic derecho -> Source -> Generate 
	// Getters and Setters)
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


	// Igual hay que hacer un paso adicional al momento de crear el
	// m�todo toString()
	// Clic derecho -> Source -> Generate toString()...
	// y en el apartado que dice "Inherited methods", seleccionar
	// la casilla que dice toString(), luego clic en Generar. Esto
	// permitir� que, al momento de imprimir en consola los par�metros
	// de la Clase Hija (Empleado en este caso), tambi�n podamos 
	// visualizar las caracter�sticas heredadas de la Clase Padre
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", salario=" + salario + ", turno=" + turno
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	// M�TODOS PROPIOS DE LA CLASE EMPLEADO
	
	public void checarEntrada() {
		System.out.println("Iniciando turno...");
	}
	
	// M�TODO ABSTRACTO - ES AQUEL QUE DEFINE QU� SE HACE, PERO NO
	// C�MO SE HACE
	
	public abstract void vender();
	

}
