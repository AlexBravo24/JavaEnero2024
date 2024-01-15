package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONDICIONALES O DE DECISI�N
		//if - Evaluan valores booleanos (true or false)
		
		int x = 10;
		
		if (x<10) {  //Si (esto es verdad) {ejecuta lo siguiente}
			System.out.println("S�");
			
		} else {     //De otro modo, {ejecuta lo siguiente}
			System.out.println("No");
		}
		
		
		//OPERADORES L�GICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - && - Devuelve el valor true cuando se cumplen TODAS las condiciones
		System.out.println("Resultado operador l�gico AND:");
		if (x<11 && x>8 && x==9) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		
		//OR - || - Devuelve el valor true cuando su cumple AL MENOS UNA de las condiciones
		System.out.println("Resultado operador l�gico OR:");
		if (x<10 || x>8 || x==9) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		
		//DIFERENTE DE - != - Compara valores y devuelve true si estos valores son diferentes
		System.out.println("Resultado operador l�gico DIFERENTE DE:");
		if (x!=20) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		
		//Un solo igual (=) sinifica ASIGNACI�N
		// int x = 10;
		
		//IGUALDAD o comparaci�n - == - Compara si los valores son iguales, devuelve true cuando se cumple.
		System.out.println("Resultado operador l�gico IGUALDAD:");
		if (x==10) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		
		//NOT - ! - Niega una condici�n o m�s bien cambia el valor de true a false y viceversa.
		System.out.println("Resultado operador l�gico NOT:");
		if (! (x==10)) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		
		
		//Estructura if-else anidado o concatenado
		System.out.println("Estructura IF-ELSE ANIDADO");
		int dia = 5;
		
		if (dia==1) {
			System.out.println("Lunes");
		}else if (dia==2) {
			System.out.println("Martes");
		}else if (dia==3) {
			System.out.println("Mi�rcoles");
		}else if (dia==4) {
			System.out.println("Jueves");
		}else if (dia==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de d�a");
		}
		
		
		//ESTRUCTURA DE DECISI�N SWITCH-CASE
		//Short-cut: switch + CTRL + espacio + enter
		System.out.println("Estructura SWITCH-CASE");
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error de d�a");
			break;
		}
		
		
		

	}

}
