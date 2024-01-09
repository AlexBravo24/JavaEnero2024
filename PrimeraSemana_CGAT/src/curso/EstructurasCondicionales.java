package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Estructuras Condicionales
		//If - Evalua valores boleanos
		
		int x = 10;
		
		if (x<10) { //Si esto es verdad ejecuta lo siguiente
			System.out.println ("Sí");
		}else { //De otro modo ejecuta lo siguiente
			System.out.println("No");			
		}
		
		//OPERADORES LÓGICOS
		//AND, OR, NOT, IGUALDAD
		
		//Condiciones compuestas
		//AND - && -Devuelve el valor true cuando se cumplen
		//todas las condiciones
		
		if (x<11 && x>8 && x==9) {
			System.out.println ("Sí");			
		}else {
			System.out.println("No");			
		}//cierre del else
		
		//OR -||- Devuelve el valor true cuando se cumpla al menos
		// UNA de las condiciones
		System.out.println("Resultado Operador lógico OR");
		if (x<11 || x>8 || x==9) {
			System.out.println ("Sí");			
		}else {
			System.out.println("No");			
		}//cierre del else
		
		
		//DIFERENTE DE - != - Compara los valores y devuelve true
		// si los valores son diferentes
		
		System.out.println("Resultado Operador lógico DIFERENTE DE");
		if (x!=20) {
			System.out.println ("Sí");			
		}else {
			System.out.println("No");			
		}//cierre del else
		
		
		//IGUALDAD O COMPARACIÓN - == - Compara si los valores son iguales
		//y devuelve true cuando esto se cumple
		
		//UN DOLO IGUAL (=) SIGNIFICA ASIGNACIÓN
		
		System.out.println("Resultado Operador lógico IGUALDAD");
		if (x==10) {
			System.out.println ("Sí");			
		}else {
			System.out.println("No");			
		}//cierre del else
		
		//NOT - ! - Niega una condición, cambia el valor de true
		// a false y viceversa
		
		System.out.println("Resultado Operador lógico NOT");
		if (! (x==10)) {
			System.out.println ("Sí");			
		}else {
			System.out.println("No");			
		}//cierre del else
		
		
		//Estructura if - else anidado o concatenado
		
		System.out.println("Estructura IF-ELSE ANIDADO");
		
		int dia = 5;
		
//		if (dia==1) {
//			System.out.println("Lunes");
//		}else if (dia==2) {
//			System.out.println("Martes");
//		}else if (dia==3) {
//			System.out.println("Miércoles");
//		}else if (dia==4) {
//			System.out.println("Jueves");
//		}else if (dia==5) {
//			System.out.println("Viernes");
//		}
		
		//ESTRUCTURA DE DECISION SWITCH-CASE
		
		System.out.println("Estructura SWITCH-CASE");
		
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
		default:
			System.out.println("Error de dia");
			break;
		}
		
		
		
	}

}
