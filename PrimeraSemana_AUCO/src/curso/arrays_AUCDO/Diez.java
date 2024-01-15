package curso.arrays_AUCDO;

public class Diez {

	public static void main(String[] args) {
		
		int indice=0;
		int [] numero = new int [10];
		
		numero[0] =1;
		numero[1] =2;
		numero[2] =3;
		numero[3] =4;
		numero[4] =5;
		numero[5] =6;
		numero[6] =7;
		numero[7] =8;
		numero[8] =9;
		numero[9] =10;
		
		
		for (int i = 0; i < numero.length; i++) {
			for ( indice = 0; indice < 10; indice++) {
				System.out.println("Indice: "+indice + " onjeto "+numero[i]);
				
			}
			System.out.println("Indice: "+indice + " onjeto "+numero[i]);
			
		}


	}

}
