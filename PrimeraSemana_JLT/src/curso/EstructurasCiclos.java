package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS  o tambien llamados BUCLES
		//Nos ayudan a ejecutar "n" veces una accion
		//de acuerdo a una condicion o condiciones
		
		//Casi suiempre para realizar la accion varias veceeee
		//para ello nos vamos a apoyar en un variable numerica
		//ya que de acuerdo al cambio del valor de la misma
		//es como se repetira la accion o bloque de codigo
		
		//WHILE (MIENTRAS SE CUMPLA UNA CONDICION)
		
		int x = 1;
		
//		while (x<5 ) { //Mientras esta condicion se cumpla
//			//Ejecutamos lo de AQUI ADENTRO
//			System.out.println("hola mundo "+ x);
//			//puedo determinar el ciclo while indicando un incremento 
//			//en la variable
//			//x = x + 1;
//			x++;
//		}
		
		//do-while - similar al ciclo while, pero por alguna razon
		//podemos encontrarnos con una condicion que no se cumpla 
		//nos aseguremos de que nuestro programa se ejecute por lo menos
		//1 vez
		
//		do {//HAZ lo siguiente (ejecuta lo siguiente)
//			System.out.println("hola mundo");
//			//x++;
//		}while(x>2); // mientras esto se cumpla
//		//evaluamos si la accion se realiza de nuevo
		
		//FOR - Ciclo determinado para un conjunto de "condiciones"
		//se utiliza mas cuando tenemos una idea de cuantas veces queremos 
		//que se realice una accion
		
		//PARA (estas condiciones){
		//ejecutamos este bloque
		//}
		
		//PARA (variable de control ;control; incremento)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("hola mundo " + i);
		}
		
	}


}
