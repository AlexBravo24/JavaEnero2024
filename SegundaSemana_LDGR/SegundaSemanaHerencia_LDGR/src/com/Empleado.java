package com;

// LA HERENCIA se realiza con la palabra reservada "extends"
public abstract class Empleado extends Persona {
	
	// Esta va a ser una Clase Hija, que heredará sus atributos
	// de la Clase Persona
	
	private String rfc;
	private String puesto;
	private double salario;
	private String turno;
	
	public Empleado() {
		// Constructor vacío
	}

	
	// Generar el constructor con todos los parámetros
	// Clic derecho -> Source -> Generate constructor using fields...
	// y un paso adicional, cuando nos aparezca el cuadro emergente, 
	// en la parte de arriba, donde dice "Select super constructor 
	// to invoke", NO seleccionar la opción que tenga los paréntesis 
	// vacíos, sino que los que tengan dentro los atributos de la Clase Padre
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
	// método toString()
	// Clic derecho -> Source -> Generate toString()...
	// y en el apartado que dice "Inherited methods", seleccionar
	// la casilla que dice toString(), luego clic en Generar. Esto
	// permitirá que, al momento de imprimir en consola los parámetros
	// de la Clase Hija (Empleado en este caso), también podamos 
	// visualizar las características heredadas de la Clase Padre
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", salario=" + salario + ", turno=" + turno
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	// MÉTODOS PROPIOS DE LA CLASE EMPLEADO
	
	public void checarEntrada() {
		System.out.println("Iniciando turno...");
	}
	
	// MÉTODO ABSTRACTO - ES AQUEL QUE DEFINE QUÉ SE HACE, PERO NO
	// CÓMO SE HACE
	
	public abstract void vender();
	

}
