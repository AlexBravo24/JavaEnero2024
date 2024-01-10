package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras Condicionales o de decisión 
		//If- Evaluan valores booleanos 
		
		int x=10; 
		
		if (x<11) { // Si (esto es verdad) ejecuta lo siguiente
			System.out.println("Si");
		} else { // Si la condicion no se cumple... ejecuta
			//lo siguiente
			System.out.println("No");
		}
		
		//OPERADORES LÓGICOS
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		
		//AND
		// Condiciones compuestas 
		// AND - && - Devuelve el valor TRUE cuando se cumplen
		// TODAS las condiciones
		
		System.out.println("Resulado del operador lógico AND: ");
		if (x<11 && x>8) {
			System.out.println("Si");
		} else { 
			System.out.println("No");
		}//cierre AND
		

		//OR
		//OR - ||- Devolver el valor TRUE cuando se cumpla al 
		//AL MENOS UNA de las condiciones
		
		
		System.out.println("Resulado del operador lógico OR: ");
		if (x<11 || x>8) {
			System.out.println("Si");
		} else { 
			System.out.println("No");
		}//Cierre OR
		
		//DIFERENTE DE 
		//Diferente de - != - Compara valores y devuelve true si
		//estos valores son diferentes 
		
		System.out.println("Resulado del operador lógico DIFERENTE DE : ");
		if (x != 20) {
			System.out.println("Si");
		} else { 
			System.out.println("No");
		}//Cierre DIFERENTE DE 
		
		//IGUALDAD
		// Igualdad o comparacion - == - Compara si los valores 
		// son iguales y devuelve TREU cuando se cumple
		
		System.out.println("Resulado del operador lógico de IGUALDAD : ");
		if (x == 20) {
			System.out.println("Si");
		} else { 
			System.out.println("No");
		}//Cierre de IGUALDAD
		
		//ASIGNACION 
		//Un solo igual (=) significa ASIGNACION
		//int x=10
		
		//NOT
		// Not - ! - Niega una condicion o mas bien, cambia el valor 
		//de true a false y viceversa
		System.out.println("Resulado del operador lógico de NOT : ");
		if (! (x == 20)) {
			System.out.println("Si");
		} else { 
			System.out.println("No");
		}//Cierre de NOT
		
		
		//ESTRUCTURA IF - ELSE ANIDADO / CONCATENADO
		
		int dia = 5;
		
		if (dia==1) { 
			System.out.println("Lunes");
		} else if (dia==2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia== 4) { 
			System.out.println("Jueves"); 
		}else if (dia ==5) {
			System.out.println("Viernes");
		}else if (dia==6) {
			System.out.println("Sabado");
		}else if (dia==7) {
		System.out.println("Domingo");
		} else {System.out.println("Error de día");}
		
		
		//ESTRUCTURA DE DESICION SWITCH - CASE
		
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
			System.out.println("Sabado");	
				break;
		case 7:
			System.out.println("Domingo");	
				break;

		default:
			System.out.println("Error de dia");
			break;
		}

			
			
			
        }
}
