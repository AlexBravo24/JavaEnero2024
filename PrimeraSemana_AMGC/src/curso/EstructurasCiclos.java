package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//CICLOS O BUCLES
		//Nos ayudan a ejecutar "n" veces una acción de acuerdo a una condición o condiciones.
		
		//Casi siempre, para realizar la acción varias veces, nos apoyaremos en una variable
		//numérica. De acuerdo al cambio del valor de la misma, es como se repetira la accción
		//o bloque de código.
		
		
		//WHILE (Mientras se cumpla una condición)
		
		int x=1;
		
		while (x<5) { //Mientras esta condición se cumpla:
			//Ejecutamos lo de adentro de {}
			System.out.println("Hola mundo");
			
			//Puedo determinar el ciclo while indicando un incremento en la variable
			x=x+1;
		}

	}

}
