package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compresor caracteristicas = new Compresor ("potencia", "costo", "tipo");
		Compresor caracteristicas = new Compresor (1.5, 2100, "Domestico");
		
		//Refrigerante operacion = new Refrigerante ("Tipo", "Presion", "Costo");
		Refrigerante operacion = new Refrigerante ("Natural", "Alta", 1700);
		
		//Refrigerador refri = new Refrigerador("Marca", "Color", "Altura", "Compresor", "Refrigerante");
		Refrigerador refri = new Refrigerador("Whirpool", "Gris", 200, caracteristicas, operacion);

		System.out.println(refri);
	}
}
