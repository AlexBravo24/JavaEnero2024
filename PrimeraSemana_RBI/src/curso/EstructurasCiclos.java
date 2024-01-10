 package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tambien llamados bucles
		// Nos ayudan a ejectuar "n" veces una acción 
		//de acuerdo a una condicion o condiciones
		
		//casi siempre para reralizar la acción varias veces
		//para ello nos vamos a apoyar en una variable numerica 
		//ya que de acuerdo al cambio del valor de la misma es como se repetira la accion o bloque de codigo
		
		// WHILE (Mientras se cumpla una condición)
		
		int x = 1;
		
//		while (x < 5) { //mientras esta condicion se cumpla
//			//Ejecutamos lo de aqui adentro
//			System.out.println("Hola mundo" + x);
//			//Puedo determinar el ciclo while indicando un incremento en la variable
//			//x = x + 1;
//			x++; 
//		}
		
		//do-while - Funciona similar al ciclo While, pero si por alguna razon
		//podemos encontrarnos con una condicion que no se cumpla nos aseguramos
		//que nuestro programa ejecute por lo menos 1 vez
		
//		do {// Ejecuta lo siguiente
//			System.out.println("Hola mundo");
//		}while(x>2); //Mientras esto se cumpla (Evaluamos si la accion se realiza de nuevo)
		
		//For - Ciclo determinado para un conjunto de "condiciones"
		//Se utiliza mas cuando tenemos una idea de cunatas veces queremos que se realice una accion
		
		//PARA (estas condicniones( {
		// ejecutamos este bloque
		//}
		
		//PARA (variable de control; condicion; incremento)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo" + i);
		}
		

	}

}
