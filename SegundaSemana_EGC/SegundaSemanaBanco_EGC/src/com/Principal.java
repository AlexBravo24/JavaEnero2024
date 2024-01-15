package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a iniciar con crear nuestro, HashMap que contendrá
		// nuestras cuentas de banco.
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Para almacenar cuentas de banco en el HashMap, puedo hacerlo
		// de 2 formas
		//Primero creando la cuenta y agregandola despues
		
		Cuenta ana = new Cuenta("Ana", 15000, 1000, 25000, "Debido");
		
		//La agregamos al hashMap
		
		cuentas.put(1001, ana);
		
		//Otra forma des agregar cuentas al HashMap es creandolas directamente en el
		
		cuentas.put(1002, new Cuenta("Edwin", 20000, 1000, 30000, "Debito"));
		cuentas.put(1003, new Cuenta("Alfredo", 1000, 500, 3000, "Debito"));
		cuentas.put(1004, new Cuenta("Omar", 200, 100, 3000, "Debito"));
		cuentas.put(1005, new Cuenta("Alex", 300000, 10000, 3000000, "Debito"));
		cuentas.put(1006, new Cuenta("Valeria", 21000, 1100, 31000, "Debito"));
		
		//Creamos nuestro objeto Cajero al cual le daremos acceso a este
		// HashMap
		Cajero cajero1 = new Cajero("Angelopolis, Puebla", cuentas);
		//Probar el metodo consultar
		System.out.println(cajero1.consultar(1002));
		
		//Probando el metodo retirar, pero excediento el limite del cajero
		System.out.println(cajero1.retirar(1001, 10000));
		
		//probando un retiro exitoso
		System.out.println(cajero1.retirar(1005, 500));
		System.out.println(cajero1.retirar(1005, 500));
		
		//probando el metodo retirar dejando por debajo del minimo la cuenta
		System.out.println(cajero1.retirar(1004, 110));
		
		//probando el metodo depositar
		System.out.println(cajero1.depositar(1003, 500));
		
		//probando depositar mas de lo permitido
		System.out.println(cajero1.depositar(1003, 50000));
		System.out.println(cajero1.depositar(1003, 1600));

	}

}
