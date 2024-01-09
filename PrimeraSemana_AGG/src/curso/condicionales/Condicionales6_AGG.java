package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_AGG {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño.
		//Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque
		//considerando lo siguiente: 
//* Si es de tipo A,se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
//* Si es de tipo B,se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
//Precio inicial se recibe desde teclado

		Scanner entrada = new Scanner(System.in);
		
		double precio;
		String tipo;
		int tamaño;
		double pago;
		
		System.out.println("Ingresa el precio de la UVA");
		precio=entrada.nextDouble();
		
		System.out.println("Ingresa el tipo de uva A o B");
		tipo=entrada.next();
		
		System.out.println("Ingresa el tañano de la uva 1 o 2");
		tamaño=entrada.nextInt();
		
		pago=precio;
		
		if (tipo.equalsIgnoreCase("A") && tamaño==1);
		{pago=(precio+=0.20);}
		 if (tamaño==2)
			{pago=(precio+=0.30);}
		if (tipo.equalsIgnoreCase("B") && tamaño==1);
			{pago=(precio-=0.30);}
		if (tamaño==2)
				{pago=(precio-=0.50);}
			
		System.out.println("Pago al Productor: " + pago);
	}

}
