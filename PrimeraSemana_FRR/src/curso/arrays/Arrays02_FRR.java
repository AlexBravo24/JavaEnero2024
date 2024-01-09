package curso.arrays;

public class Arrays02_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [100];
		
		int suma = 0;
		
		for (int i = 0; i < 100; i++) {
			
			numeros[i] = i + 1 ;
			
			System.out.println(numeros[i]);
			
			suma = suma + numeros[i];
		} 

		System.out.println("La suma de todos los numeros es " + suma);
		
		System.out.println("La media de todos los numeros es " + (suma/100));
	}

}
