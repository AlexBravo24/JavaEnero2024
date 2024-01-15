package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
//		int x = 10;
//		 
//		System.out.println("X es menor que 10");
//		if (x<10) {
//			System.out.println("sI"); 
//		}else {
//			System.out.println("No");
//		}
//		
//		//Operadores logicos
//		//AND, OR, NOT DIFERENTE DE, IGUALDAD
//		
//		System.out.println("X es menor que 11, mayor que 8 e igual a 10");
//		if(x<11 && x>8 && x==10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		// || es igual a or, si se cumple alguna de las condiciones
//		//pasara como si se cumplieran todas
//		
//		//x==10 es la unica condicion que se cumple aqui
//		System.out.println("X no es menor que 10, no es mayor que 12 PERO es IGUAL a 10");
//		if(x<10 || x>12 || x==10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		
//		// valor DIFERENTE DE !=
//		System.out.println("X es DIFERENTE que 20");
//		if (x!=20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//			
//		
//		
//		//Compara si los valores son iguales
//
//		System.out.println("Compara X con otro valor");
//		if (x==20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		
//		
//		
//		//NOT = ! NIEGA UNA CONDICION
//		
//		System.out.println("Aunque X es igual a 10 l valor ! lo niega");
//		if (! (x==10)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
	
	
//		System.out.println("if else anidado");
//		
		int dia = 7;
//		 	
//			if (dia == 1) {
//				System.out.println("Lunes");
//			}else if (dia == 2){
//				System.out.println("Martes");
//			}else if (dia == 3){
//				System.out.println("Miercoles");
//			}else if (dia == 4){
//				System.out.println("Jueves");
//			}else if (dia == 5){
//				System.out.println("Viernes");
//			}else if (dia == 6 || dia == 7){
//				System.out.println("Fin de semana");
//			}else {
//				System.out.println("Error de dia");
//			}
	
			
			
			switch (dia) {
			
			
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Fin de semana");
				break;
			case 7:
				System.out.println("Fin de semana");
				break;
			
				default:
					System.out.println("Error de dia");
					break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	}

}
