package curso.condicionales;

import java.util.Scanner;

public class Condicionales6_AGG {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o.
		//Se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque
		//considerando lo siguiente: 
//* Si es de tipo A,se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
//* Si es de tipo B,se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
//Precio inicial se recibe desde teclado

		Scanner entrada = new Scanner(System.in);
		
		double precio;
		String tipo;
		int tama�o;
		double pago;
		
		System.out.println("Ingresa el precio de la UVA");
		precio=entrada.nextDouble();
		
		System.out.println("Ingresa el tipo de uva A o B");
		tipo=entrada.next();
		
		System.out.println("Ingresa el ta�ano de la uva 1 o 2");
		tama�o=entrada.nextInt();
		
		pago=precio;
		
		if (tipo.equalsIgnoreCase("A") && tama�o==1);
		{pago=(precio+=0.20);}
		 if (tama�o==2)
			{pago=(precio+=0.30);}
		if (tipo.equalsIgnoreCase("B") && tama�o==1);
			{pago=(precio-=0.30);}
		if (tama�o==2)
				{pago=(precio-=0.50);}
			
		System.out.println("Pago al Productor: " + pago);
	}

}
