package curso;

import java.util.Scanner;

public class EntradaDeDatos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = scan.nextLine();
		System.out.println("Ingrese su edad");
		int age = scan.nextInt();
		System.out.println("Tu nombre es " + nombre + " y tienes " + age + " años");
		
	}

}
