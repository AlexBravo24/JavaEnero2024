package Udemy;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		//OPERADORES ARITMETICOS
		
		//Suma
		
		int a= 3+4;
		System.out.println("Suma: "+a);
		
		//Resta 
		int b=6-2;
		System.out.println("Resta: "+b);
		
		//Multiplicacion
		int c= a*2;
		System.out.println("Multiplicacion: "+ c);	
		
		//Division
		
		double d = b / 2.5;
		System.out.println("Divisi:" + d);
		
		//Modulo (residuo division)
		int f=9%2;
		System.out.println("Residuo: "+f);
		
		//Potencia 
		//Clase "Math" + metodo ".pow" y en argumentos 
		// a= numero y b=potencia
		double e= Math.pow(a, 2);
		System.out.println("Potencia: "+e);
		
		
		//INCREMENTO Y DECREMENTO
		
		int x = 0;
		
		//INCREMENTO
		
		//Operadores de post-incremento
		
		System.out.println("Antes de incrementar: "+x);

		x++;
		System.out.println("Despues de incrementar (x++): "+x);
		
		//Operadores de pre-incremento
		
		x=5;
		
		System.out.println("Antes de incrementar: "+x);
		
		++x;

		System.out.println("Despues de incrementar(++x): "+x);
		
		
		//DECREMENTO
		
		//Operadores de post-decremento
		
		x=10;
		
		System.out.println("Antes de decrementar: "+x);

		x--;
	    System.out.println("Despues de decrementar (x--): "+x);
				
		//Operadores de pre-decremento
				
		x=5;
				
		System.out.println("Antes de decrementar: "+x);
				
		--x;

		System.out.println("Despues de decrementar(--x): "+x);
		
		
		//OPERADORES LOGICOS
		boolean m=true;
		boolean n=false;
		System.out.println("Valor m: "+m);
		System.out.println("Valor n: "+n);
		
		//AND &&
		//Regresa TRUE si ambos operandos son Verdaderos 
		
		boolean q= m&&n;
		System.out.println("Resultado de operador Y: "+q);
		
		//OR ||
		//Regresa TRUE si alguno de los operandos son Verdaderos
		q= m||n;
		System.out.println("Resultado de operador O: "+q);
		
		//NOT !#
		//INVIERTE LOS RESULTADOS 
		q= !n;
		System.out.println("Resultado de operador NO: "+q);
		
		//DENTRO DE RANGO
		//Se ocupa el operador AND ya que se tiene que verificar 
		//que sea verdadero tanto un lado como el otro
		
		int minimo=0;
		int maximo=5;
		//Solicitamos un valor entre 0 y 5
		Scanner entrada = new Scanner(System.in);
		 System.out.print("Proporciona un valor: ");
		 int numero= entrada.nextInt();
		//Verificamos si el dato esta dentro de rango
		 boolean dentroRango = numero >= minimo  && numero <= maximo;
		 System.out.println("Valor dentro de rango: "+dentroRango);
		 
		
		
		
		
		
		

	}

}
