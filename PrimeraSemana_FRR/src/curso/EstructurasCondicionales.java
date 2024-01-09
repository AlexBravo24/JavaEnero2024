package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ESTRUCTURAS CONDICIONALES O DE DECISION 
		//IF- EVALUAN VALORES BOOLEANOS
		
		int x = 15;
		if(x < 10) { //si esto es verdad, se ejecuta lo siguiente
			System.out.println("si");
			
		} else { //si no se cumple ejecuta esta otra parte
			System.out.println("no");
		}
		
		//OPERADORES LOGICOS 
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND && DEVUELVE EL VALOR true CUANDO SE CUMPLEN TODAS LAS CONDICIONES
		System.out.println("resultado operador logico and");
		if(x<11 && x>8) {
			System.out.println("si");
		}else {
		System.out.println("no");
		
		
		
        }

		//OR - || DEVUELVE EL VALOR TRUE CUANDO SE CUMPLA ALGUNA DE LAS CONDICIONES 
		System.out.println("resultado operador logico or");
		if(x<11 || x>8 || x==9) {
			System.out.println("si");
		} else {
					System.out.println("no");
		}
		
		//DIFERENTE DE- != COMPARA VALORES Y DEVUELVE TRUE SI SON DIFERENTES 
		System.out.println("resultado operador logico DIFERENTE DE");
		if (x != 5) {
			System.out.println("si");
		} else {
					System.out.println("no");
		}
		
		//IGUALDAD O COMPARACION - == COMPARA SI LOS VALORES SON IGUALES 
		//DEVUELVE TRUE SI ESTO SE CUMPLE
		//UN SOLO IGUAL ES ASIGNACION 
		//DOS IGUALES ES PARA COMPARAR VALORES
		
		System.out.println("resultado operador logico IGUAL");
		if(x==10) {
			System.out.println("si");
		} else {
					System.out.println("no");
		}
		//OPERADOR LOGICO NOT DEVUELVE EL RESULTADO INVERSO
		System.out.println("resultado operador logico not");
		if(!(x == 10)) {
			System.out.println("si");
		} else {
					System.out.println("no");
		} //LA CONDICION TENDRÍA QUE IMPRIMIR SI, PERO AL AGREGAR ! ARROJA EL
		//RESULTADO CONTRARIO
		
		
		//--------------ESTRUCTURA IF-ELSE ANIDADO O CONCATENADO---------------
		System.out.println("estructura if else anidado");
		int dia = 5;
		
		if (dia == 1) {
			System.out.println("lunes");
		}else if(dia==2) {
			System.out.println("martes");
		}else if(dia==3) {
			System.out.println("miercoles");
		}else if(dia==4) {
			System.out.println("jueves");
		}else if(dia==5) {
			System.out.println("viernes");
		}else if(dia==6) {
			System.out.println("sabado");
		}else if(dia==7) {
			System.out.println("domingo");
		} else {
			System.out.println("error de dia");
		}
		
		//ESTRUCTURA DE DECISION SWITCH CASE
		
		System.out.println("estructura switch case");
		
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
}
}