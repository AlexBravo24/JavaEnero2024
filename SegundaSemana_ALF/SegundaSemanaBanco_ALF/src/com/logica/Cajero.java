package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
		
		//En este paquete se encuentra contenida la clase
		//que creara los objetos que realizaran
		//las operaciones

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	///Variable auxiliar para incrementar el folio del ticket
	private int folio=1;
	
	public Cajero() {
		
	}
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuenta consultar(int numeroCuenta) {
		//Instanciamos una cuenta para devolver ese valor
		
		Cuenta cuenta = null;
		//La cuenta que vamos a consultar se encuentra guardada en un hashMap
		//entonces la asignamos si existe
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un ticket vacio
		Ticket ticket = null;
		
		//Antes de realizar un retiro primero necesitamos buscar la cuenta
		//si la cuetna existe entonces lapodemos manipular
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Una vez lacalizada la cuenta y la podamos manipular
			//Existen validaciones antes de poder realizar dicha operacion
			//Vamos a crear un ejemplo de que e cajero solo permite retirar cierta cantidad
			
			if(monto>9000) {
				System.out.println("Solo puedes retirar un maximo de 9000.");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {
				
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
				
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMIn()) {
				
				System.out.println("El retiro dejaria por debajo del minimo ala cuenta");
				return ticket;
				
				
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Aho
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(),cuenta.getSaldo(), sucursal,1);
				return ticket;
				
			}
			
			
		}else {//SI la cuenta no existe 
			System.out.println("No hay cuetna asociada a ese cliente");
			return ticket;
			}
		}
		
	

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		
		
		
		Ticket ticket = null;
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validamos si el momto a depositar es mayor que el saldo maximo 
			//que permite la cuenta
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cta");
				return ticket;
				
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo excederia el maximo permitido en la cuenta");
				
				return ticket;
				//si el deposito puede realizarce
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(),cuenta.getSaldo(), sucursal,1);
				return ticket;
				
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
		}
		
		
		return ticket;
	}
	
	
}
