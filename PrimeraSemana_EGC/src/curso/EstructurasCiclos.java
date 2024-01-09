package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o tambien llamadas BUCLES
		//Nos ayudan a ejecutar N veces una acción
		//de acuerdo a una condicion o condiciones
		//Casi siempre para realizar la acción varias veces
		//nos vamos a apoyar en una variable numerica 
		// ya que de acuerdo al valor de la variable
		// es como se repetira la acción o bloque de codigo
		
		//WHILE (Mientras se cumpla una condicion)
		
		int x = 1;
		
//		while (x < 5 ) { //Mientras que la condicion se cumpla
//			//Se ejecutara este codigo
//			System.out.println("Hola mundo! " + x);
//			// puedo determinar el ciclo while indicando
//			// un incremento en la variable
//			x = x + 1; // o se puede usar x++
//		}

		// do while funciona similar a while 
		//pero este se ejecuta por lo menos una vez aunque la condicion no se cumpla
		
		do { //Haz lo siguiente
			System.out.println("hola mundo?");
		} while(x > 2); //evaluamos si la accion se realiza de nuevo
			
		//CICLO FOR
		// Es un ciclo determinado para un conjunto de condiciones
		// Se utiliza cuando tenemos idea de cuantas veces necesitamos que se realice una acción
		
		// FOR (VARIABLE DE CONTROL; CONDICION; INCREMENTO)
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Hola mundo " + i);
			
		}
	}

}
