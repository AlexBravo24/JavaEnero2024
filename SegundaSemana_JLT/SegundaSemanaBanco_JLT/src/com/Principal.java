package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a iniciar con crear nuestro HasMAp que contendra
		//nuestras cuentas de banco
		
        Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

        //Para almacenar cuentas de banco en el HasMap, puedo hacerlo
        //de dos formas
        //Primero creando la cuenta y agregandola despues

        Cuenta ana = new Cuenta("Ana", 15000, 1000, 25000, "Debito");

        //La agregamos al HasMap
        cuentas.put(1001, ana);
        
        //Otra forma de agregar cuentas al HasMap es creandolas directamente
        //en él
        cuentas.put(1002, new Cuenta("Alfredo", 10000, 500, 30000, "Debito"));
        cuentas.put(1003, new Cuenta("Edwin", 1000, 100, 20000, "Debito"));
        cuentas.put(1004, new Cuenta("Omar", 11000, 4000, 50000, "Debito"));
        cuentas.put(1005, new Cuenta("Alexis", 3000, 500, 30000, "Debito"));
        
        
        //Creamos nuestro objeto Cajero al cual le daremos acceso a este 
        //HasMap
        Cajero cajero1 = new Cajero("Angelopolis, Puebla", cuentas);
        
        //Probar el método consultar de nuestro cajero
        System.out.println(cajero1.consultar(1005));
        
        //Probar el método retirar, pero excediendo el limite del cajero
        System.out.println(cajero1.retirar(1001, 10000));
        
        //Probando un retiro exitoso
        System.out.println(cajero1.retirar(1005, 500));
        System.out.println(cajero1.retirar(1005, 500));
        
        //Probando del metodo retirar dejando por debajo del minimo a la cta
        System.out.println(cajero1.retirar(1004, 8000));
        
        
        //Probando a depositar exitoso
        System.out.println(cajero1.depositar(1004, 4000));
        System.out.println(cajero1.depositar(1004, 19000));



	}

}
