package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

//No reconoce la interfase porque no pertenece al mismo paquete asi que la debemos 
//importar 

//Despues Cajero no se reconoce porque la interface recien reconocida tiene metodos
//que esta clase debe definir asi que debemos 'implementar metodos' y se sobreescriban
//con Override
public class Cajero implements IMetodos {
	
	/* Objeto que se encarga de realizar ciertas operaciones (como una calculadora)
	 * 
	 * En este paquete se encuentra contenida la clase que creará los objetos 
	 * que realizaran las operaciones
	 */
	
	//Antes de definir los metodos (acciones) vamos a declarar algunas variables
	//que nos ayudaran a crearlos y ayudar
	
	private String sucursal; //El cajero tiene no.sucursal en donde se encuentra
	private Map<Integer, Cuenta> cuentas;  //En donde vamos a tener las cuentas de Banco
	
	//variable auxiliar
	private int folio=1; //Para incrementar el folio del ticket
	
	//Generamos constructo vacio de cajero
	public Cajero() {
		
	}
	//Generamos constructor de todos los parametros sin el folio porque solo es para
	//incrementar el valor del folio
	
	
	
	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Recuperar la info del HashMap con con la clave: cuenta
		//Devolver objeto cuenta 
		
		//Instanciamos una cuenta para devolver el valor
		Cuenta cuenta =null; //Cuenta vacia
		//La cuenta que vamos a consultar esta guardada en un HashMap. 
		//Entonces la asignamos, si es que existe.
		
		//Si existe sera asi...y se recuperara el valor mediante 'numeroCuenta' [key]
		cuenta = cuentas.get(numeroCuenta);
		
		//Si existe...se asigna a cuenta y se retorna el valor a cuenta aqui:
		//Devolver valor de cuenta vacia hasta ahora
		return cuenta;
		
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un Ticket vacío
		Ticket ticket =null;
		//Antes de realizar un retiro, primero necesitamos buscar la cuenta
		//Si la cuenta existe, entonces la podemos manipular
		if (consultar(numeroCuenta)!=null) {
			Cuenta cuenta=consultar(numeroCuenta);
			//Una vez localizamos la cuenta y la podemos manipular (saldo)
			//existen validaciones antes de poder realizar dicha operacion
			//Vamos a crear un ejemplo de que el cajero solo permite retirar cierta
			//cantidad
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $9,000");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente");
				return ticket;
			}else if (cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del mínimo a la cuenta");
				return ticket;
			}else {//Si el retiro puede realizarse
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Entonces ahora si emitimos un nuevo Ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else { //si la cuenta no existe 
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	
	}	


	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket =null;
		
		if (consultar(numeroCuenta)!=null) {
			Cuenta cuenta=consultar(numeroCuenta);
		
		//Validamos si el monto a depositar es mayor que el saldo maximo 
		//que permite la cuenta
		if (monto> cuenta.getSaldoMax()) {
			System.out.println("el monto excede el saldo maximo permitido en la cuenta");
			return ticket;
		}else if (cuenta.getSaldoMax()+monto>cuenta.getSaldoMax()) {
			System.out.println("El saldo excederia el maximo permitido en la cuentas");
			return ticket;
		}else {//Si el deposito puede realizarse
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			
			
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
