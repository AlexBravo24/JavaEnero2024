package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		/* Vamos a iniciar creando nuestro HashMap que contendrá las cuentas
		 * de banco
		 */
		
		Map<Integer, Cuenta> cuentas= new HashMap <Integer, Cuenta>();
		
		//Para almacenar cuentas de banco en el HashMAp puedo hacerlo de dos formas
		//1. Creando la cuenta y agregandola
		
		Cuenta ana = new Cuenta("Ana", 15000, 1000, 25000, "Debito");
		
		//La agregamos al HashMap
		cuentas.put(1001, ana);
		
		//2. Creandolas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Alfredo", 10000, 500, 30000, "Debito"));
		cuentas.put(1003, new Cuenta("Edwin", 1000, 100, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Omar", 12000, 5000, 30000, "Debito"));
		cuentas.put(1005, new Cuenta("Alex", 3000, 500, 30000, "Debito"));
		
		//Creamos nuestro objeto Cajero al cual le daremos acceos a este HashMap
		
		Cajero cajero1= new Cajero("Angelopolis, Puebla",cuentas);
		
		//Probar el método consultar de nuestro cajero
		System.out.println(cajero1.consultar(1005));
		
		//Probando el metodo retirar, pero excediendo el limite del cajero 
		System.out.println(cajero1.retirar(1001,10000));
		
		//Probando un retiro exitoso 
		System.out.println(cajero1.retirar(1005, 500));
		
		//Probando el metodo retirar dejando por debajo del minimo de la cuenta
		System.out.println(cajero1.retirar(1004, 8000));
		
		
		
		
		
		
		
	}

}
