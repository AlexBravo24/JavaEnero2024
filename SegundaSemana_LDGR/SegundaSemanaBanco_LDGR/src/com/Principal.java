package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a iniciar con crear nuestro HashMap que 
		// contendrá nuestras cuentas de banco
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		// Para almacenar cuentas de banco en el HashMap, puedo 
		// hacerlo de dos formas
		// Primero creando la cuenta y agregándola después
		Cuenta ana = new Cuenta("Ana", 15000, 1000, 25000, "Débito");
		
		// La agregamos al HashMap
		cuentas.put(1001, ana);
		
		// Otra forma de agregar cuentas al HashMap es creándolas
		// directamente en él
		
		cuentas.put(1002, new Cuenta("Alfredo", 10000, 500, 30000, "Débito"));
		cuentas.put(1003, new Cuenta("Edwin", 1000, 100, 20000, "Débito"));
		cuentas.put(1004, new Cuenta("Omar", 11000, 4000, 50000, "Débito"));
		cuentas.put(1005, new Cuenta("Alexis", 3000, 500, 30000, "Débito"));
		
		// Creamos nuestro objeto Cajero al cual le daremos acceso
		// a este HashMap
		Cajero cajero1 = new Cajero("Angelopolis, Puebla", cuentas);
		
		// Probar el método "consultar" de nuestro cajero
		System.out.println(cajero1.consultar(1005));
		
		// Probando el método "retirar", pero excediendo el
		// límite del cajero
		System.out.println(cajero1.retirar(1001, 10000));
		
		// Probando un retiro exitoso
		System.out.println(cajero1.retirar(1005, 500));
		System.out.println(cajero1.retirar(1005, 500));
		
		// Probando el método "retirar" dejando por debajo del
		// mínimo la cuenta
		System.out.println(cajero1.retirar(1004, 8000));
		
		// Probando el método "depositar" exitoso
		System.out.println(cajero1.depositar(1004, 4000));
		
		// Probando "depositar" rebasando el saldo máximo permitido
		System.out.println(cajero1.depositar(1003, 21000));

	}

}
