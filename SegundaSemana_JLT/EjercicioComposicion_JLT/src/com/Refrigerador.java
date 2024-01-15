package com;

public class Refrigerador {

	//Refrigerador refri = new Refrigerador("Whirpool", "Gris", 200, "Compresor", "Refrigerante");
	
    private String marca;
    private String color;
    private double altura;
    private Compresor caracteristicas;
    private Refrigerante operacion;
    
    public Refrigerador() {
    
    }

	public Refrigerador(String marca, String color, double altura, Compresor caracteristicas, Refrigerante operacion) {
		super();
		this.marca = marca;
		this.color = color;
		this.altura = altura;
		this.caracteristicas = caracteristicas;
		this.operacion = operacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Compresor getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Compresor caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Refrigerante getOperacion() {
		return operacion;
	}

	public void setOperacion(Refrigerante operacion) {
		this.operacion = operacion;
	}

	@Override
	public String toString() {
		return "Refrigerador [marca=" + marca + ", color=" + color + ", altura=" + altura + ", caracteristicas="
				+ caracteristicas + ", operacion=" + operacion + "]";
	}
    
    
    



    
 
}
