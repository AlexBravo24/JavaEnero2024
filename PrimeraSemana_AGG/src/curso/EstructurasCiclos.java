package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS o BUCLES
		//Nos ayudan a ejecutar "n" veces una accion
		//de acuerdo a una condición o condiciones
		//Casi siempre para realizar la accion varias veces
		//para ello nos vamos a apoyar en una variable numerica
		//ya que de acuerdo al cambio del valor de la misma
		//es como se repetirá la acción o bloque de código
		
		//WHILE (mientras se cumpla una condicion)
		
		int x=2;
		
		while (x<=5) //mientras esta condicion se cumpla, se ejecuta lo de adentro de las llaves {}
		{System.out.println("Hola Mundo");
					//puedo determinar el ciclo while indicando un incremento en la variable
					//puede ser como: x=x+1; o x++;
		x = x+1;}
		
		//DO-WHILE - es similar al ciclo while, pero por si alguna razon
		
		//podemos encontranos con una condicion que no se cumpla
		//nos aseguramos de que nuestro programa se ejecute por lo menos 1 vez
		
		do //Haz o ejecuta lo siguiente
		{System.out.println("Hola Mundo");
		x++;}
		while(x<2); //se evalua si la accion se realiza nuevamente, si la variable sigue sin
					//ser mayor a 2, se sigue evaluando y ciclando
		
		//FOR - ciclo determinado para un conjunto de "condiciones"
		//se utiliza mas cuando tenemos una idea de cuantas veces queremos
		//que se realice una acción
		
		//while= PARA - (estas condiciones){
		//ejecutamos este bloque
		//}
		
		//PARA (Variable de control; condicion; incremento)
		
		for (int i=0; i<5; i++) //para una variable de control (en este casi i) que empieza desde (cero en este caso)
								//evalùa la condicion de enmedio, manda a imprimir en consola y por ultimo, 
								//ejecuta la tercer condiciòn (en este caso, incrementa la variable en 1)
			{System.out.println("Hola Mundo"+i);}
	}

}
