package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o tambi�n llamados BUCLES
		// Nos ayudan a ejecutar "n" veces una acci�n
		// de acuerdo a una condici�n o condiciones
		
		// Casi siempre, para realizar la acci�n varias veces,
		// para ello nos vamos a apoyar en una variable num�rica,
		// ya que, de acuerdo al cambio del valor de la misma,
		// es como se repetir� la acci�n o bloque de c�digo
		
		//WHILE (Mientras se cumpla una condici�n)
		
		int x = 1;
		
//		while (x<5) { // Mientras esta condici�n se cumpla, ejecutamos
//			// lo de AQU� ADENTRO
//			
//			System.out.println("Hola mundo " + x);
//			
//			// Puedo volver el ciclo "Determinado" indicando un
//			// incremento en la variable
//			
//			x = x + 1; // Otra manera de escribirlo es: x++;
//		}

		// DO-WHILE - Similar al ciclo while, pero si por alguna raz�n
		// podemos encontrarnos con una condici�n que no se cumpla,
		// nos aseguramos de que nuestro programa se ejecute por
		// lo menos UNA vez
		
//		do { //HAZ LO SIGUIENTE (Ejecuta lo siguiente)
//			System.out.println("Hola mundo");
//		}while(x>2); // MIENTRAS ESTO SE CUMPLA (Evaluamos si la 
//		             // acci�n se realiza de nuevo
		
		
		// FOR - Ciclo determinado para un conjunto de "condiciones"
		// Se utiliza m�s cuando tenemos una idea de cuantas veces
		// queremos que se realice una acci�n
		
		// PARA (estas condiciones) {
		// ejecutamos este bloque
		// }
		
		// PARA (variable de control; condici�n; incremento)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo " + i);
		}
		
		
	}

}
