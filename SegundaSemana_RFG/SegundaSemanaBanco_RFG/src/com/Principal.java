package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		Map <Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		Cuenta ana = new Cuenta("Ana", 15000, 500, 30000, "Debito");
		
		cuentas.put(1001, ana);
		
		cuentas.put(1002, new Cuenta("Roberto", 40000, 500, 70000, "Debito"));
		cuentas.put(1003, new Cuenta("Omar", 30000, 500, 70000, "Debito"));
		cuentas.put(1004, new Cuenta("Stefany", 50000, 500, 70000, "Debito"));
		cuentas.put(1005, new Cuenta("Cris", 40000, 500, 70000, "Crédito"));
		
		Cajero cajero1 = new Cajero("Puebla", cuentas);
		
		//Vamos a probar el método "consultar" de nuestro cajero;
		
		System.out.println(cajero1.consultar(1004));
		System.out.println(cajero1.retirar(1005, 5000));
		System.out.println(cajero1.depositar(1005, 2000));
		
	}

}
