package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		
		// Vamos a iniciar con crear nuestro HashMap que 
		//contendra nuestras cuentas de banco
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		/*Para almacenar cuentas de banco en el HashMap, puedo
		 * hacerlo de dos formas
		 * Primero creando la cuenta ya agregandola despues*/
		Cuenta ana = new Cuenta("Ana",15000,1000,2500,"Debito");
		
		//la agregamos al hashMap
		cuentas.put(1001,ana);
		
		//otra forma de agregar cuentas al hashMap es creandolas
		//directamente en el 
		
		cuentas.put(1002, new Cuenta("Alfredo",10000,500,20000,"Debito"));
		cuentas.put(1003, new Cuenta("Edwin",10000,100,20000,"Debito"));
		cuentas.put(1004, new Cuenta("Omar",11000,5000,30000,"Debito"));
		cuentas.put(1005, new Cuenta("Alex",3000,500,30000,"Debito"));
		
		//Creamos nuestro objeto cajero al cual le daremos acceso a este
		//hashMap
		
		Cajero cajero1 = new Cajero("Angelopolis, Puebla", cuentas);
		
		System.out.println(cajero1.consultar(1009));
		
		
		//Probaremos el metodo retirar pero excediendo el limite del cajero
		
		System.out.println(cajero1.retirar(1001,10000));
		//probando retiro exitoso
		System.out.println(cajero1.retirar(1005,200));
		System.out.println(cajero1.retirar(1005,5000));
		
		//Probando el metodo retirar dejando por debajo la cuenta
		System.out.println(cajero1.retirar(1004,8000));
		
		//Probando a depositar exitoso
		
		System.out.println(cajero1.depositar(1004,4000));
		//deposito de excede el monto aceptado
		
		System.out.println(cajero1.depositar(1003,34000));
		
		
		//depositar a un cliente que no existe
		
		System.out.println(cajero1.depositar(1009,34000));
		
		//deposito suma el maximo del monto
		System.out.println(cajero1.depositar(1003,20000));
		
		
		
		

	}

}
