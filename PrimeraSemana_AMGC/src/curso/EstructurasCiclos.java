package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//CICLOS O BUCLES
		//Nos ayudan a ejecutar "n" veces una acci�n de acuerdo a una condici�n o condiciones.
		
		//Casi siempre, para realizar la acci�n varias veces, nos apoyaremos en una variable
		//num�rica. De acuerdo al cambio del valor de la misma, es como se repetira la accci�n
		//o bloque de c�digo.
		
		
		//WHILE (Mientras se cumpla una condici�n)
		
		int x=1;
		
		while (x<5) { //Mientras esta condici�n se cumpla:
			//Ejecutamos lo de adentro de {}
			System.out.println("Hola mundo");
			
			//Puedo determinar el ciclo while indicando un incremento en la variable
			x=x+1;
		}

	}

}
