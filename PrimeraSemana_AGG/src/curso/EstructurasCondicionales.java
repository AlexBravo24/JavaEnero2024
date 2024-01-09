package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// ESTRUCTURAS CONDICIONALES O DE DECISIÓN 
		// if - EVALUAN VALORES BOOLEANOS 
		
		int x = 10;
		
		if (x<10) { //if o sí, la condicion dentro de los parentesis se cumple, se ejecuta lo que este
		            //dentro de las llaves {} 
		System.out.println("si");}
		else {// si la condicionante if no se cumple, entonces con else
			  //ejecutas lo siguiete
		System.out.println("no");}
		
		//OPERADORES LOGICOS
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD 
		
		//CONDICIONES COMPUESTAS
		//Operador AND - && - decuelve el valor true cuando se cumplen TODAS las condiciones
		System.out.println("Resultado Operador Lògico AND ");
		if(x<=10 && x>8 && x>9 && x==10) {System.out.println("si");} //== condicional de igualdad doble igual
		else {System.out.println("no");}
		
		// Operador OR - || (altGr + 1) devolver el valor TRUE
		// cuando al menos una condicion se cumple 
		System.out.println("Resultado Operador Lògico OR ");
		if(x<=10 || x>12 || x>9 || x==10) {System.out.println("si");}
		else {System.out.println("no");}
		
		//Operador <Diferente DE> "!=" compara valores y devuelve TRUE si, estos valores son diferentes
		System.out.println("Resultado Operador Lògico Difernete De ");
		if(x != 20) {System.out.println("si");}
		else {System.out.println("no");}
		
		//Operador logico igualdad o comparación - == - (doble igual)
		//compara si los valores son iguales
		// devuelve TRUE si se cumple
		
		System.out.println("Resultado Operador Lògico IGUALDAD ");
		if(x == 20) {System.out.println("si");}
		else {System.out.println("no");}
		
		//Operador logico NOT - ! - (signo de admiración)
		//niega una condicion o mas bien, cambia el valor de true a false
		// o viceversa 
		
		System.out.println("Resultado Operador Lógico NOT ");
		if(!(x == 20)) {System.out.println("si");}
		else {System.out.println("no");}
		
		//ESTRUCTUTA if - else ANIDADO O CONCATENADO 
		System.out.println("Estructura if-else ANIDADO");
		int dia = 3;
		
		if(dia==1)
			{System.out.println("Lunes");}
		else if(dia==2)
			{System.out.println("Martes");}
		else if(dia==3)
			{System.out.println("Miercoles");}
		else if(dia==4)
			{System.out.println("Jueves");}
		else if(dia==5)
			{System.out.println("Viernes");}
		else {System.out.println("error de dia");} 
		
		
		//ESTRUCTURA DE DECISION SWITCH - CASE 
		System.out.println("Estructura SWITCH - CASE");
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
			
		default:
			System.out.println("error de dia");
			break;
		}
		
		//
		
		
		
	}
		
		
	}


