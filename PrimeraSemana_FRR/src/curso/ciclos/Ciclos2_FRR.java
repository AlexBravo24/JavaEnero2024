package curso.ciclos;
import java.util.Scanner;
public class Ciclos2_FRR {

	
	//PROGRAMA QUE CREA LA TABLA DE MULTIPLICAR DEL NUMERO QUE EL USUARIO DESEE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		int x = entrada.nextInt();
		
		System.out.println("¿hasta que interación lo deseas?");
		int y = entrada.nextInt();
		
		for (int i = 1; i <= y; i=i+1) {
			System.out.println(x + " X " + i + " = " + (x * i));
		}
	}

}
