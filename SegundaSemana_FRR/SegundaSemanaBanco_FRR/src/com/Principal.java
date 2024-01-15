package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		//Vamos a iniciar con crear nuestro HashMap que contendra las cuentas
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
	//para almacenar cuentas de banco en el hashmap se puede crear de dos formas
		//Primero creando cuenta y agregandola
		Cuenta ana = new Cuenta("ana", 15000, 1000, 25000, "Debito");
		
		//O la agregamos al hashmap
		cuentas.put(1001, ana);
		
		//otra forma es creandolas directamente
		cuentas.put(1002, new Cuenta("Alfredo", 10000, 500, 30000, "Debito"));
		cuentas.put(1003, new Cuenta("Edwin", 1000, 100, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Omar", 11000, 400, 50000, "Debito"));
		cuentas.put(1005, new Cuenta("Alexis", 3000, 500, 30000, "Debito"));
		
		//creamos nuestro objeto cajero al cual le daremos acceso a este hashmap
		
		Cajero cajero1 = new Cajero("puebla", cuentas);
		
		//Probar el metodo consultar de nuestro cajero
		System.out.println(cajero1.consultar(1005));
		
		//Probando el metodo retirar pero excediendo el limite
		System.out.println(cajero1.retirar(1001, 10000));
		
		//Probando un retiro exitoso
		System.out.println(cajero1.retirar(1002, 500));
		System.out.println(cajero1.retirar(1004, 500));
		
		//probando a depositar exitoso
		System.out.println(cajero1.depositar(1004, 4000));
		System.out.println(cajero1.depositar(1003, 20000));
	}

}
