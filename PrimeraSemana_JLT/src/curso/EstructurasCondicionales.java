package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras Condicionales o de decisión 
		//If = Evalua valores booleanos
		
		int x = 10;
		
		if (x<10) { //si esto es verdad {ejecuta lo siguiente
			System.out.println("Si");	
		}else { //De otro modo, ejecuta lo siguiente
			System.out.println("No");
		}

		//OPERADORES LOGICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas 
		//AND-&&- Devuelve el valor true cuando se cumplen 
		//todas las condiciones
		System.out.println("Resultado Operador logíco AND");
		if (x<11 && x>8 && x==9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		//OR = || = Devolver el valor true cuando se cuampla al menos
		//UNA de las condiciones
		System.out.println("Resultado Operador logíco OR");
		if (x<11 || x>8 || x==9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		//DIFERENTE DE - != - Compara los valores y devuelve true
		//si estos valores son diferentes
		
		System.out.println("Resultado Operador logíco DIFERENTE DE");
		if (x !=20) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		//IGUALDAD O comparacion - == - compara si los valores son iguales
		//y devuelve true cuando esto se cumple
		
		//Un solo = significa asignacion
		//int x = 10; (asigno el valor 10 en mi variable)
		
		System.out.println("Resultado Operador logíco IGUALDAD");
		if (x == 10) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		//NOT - ! - Niega una condicion o más bien cambia el valor de true
		//a false del else
		
		System.out.println("Resultado Operador logíco NOT");
		if (!(x == 9)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}//cierre del else
		
		
		
		//ESTRUCTURA if-else anidado o concatenado
		
		int dia = 5;
		
		if (dia ==1) {
			System.out.println("Lunes");	
		}else if(dia ==2) {
			System.out.println("Martes");
		}else if(dia ==3) {
			System.out.println("Miercoles");
		}else if(dia ==4) {
			System.out.println("Jueves");
		}else if(dia ==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de dia");
		}
		
		//ESTRUCTURA DE DECISION SWICHT-CASE
		
		System.out.println("ESTRUCTURA SWITCH-CASE");
		
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
		
		
		
	}//cierre del main

}//cierre de la clase
