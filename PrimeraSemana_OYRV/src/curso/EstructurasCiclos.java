package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o también llamados BUCLES
		//Nos ayudan a ejecutar "n" veces una acción
		//de acuerdo a una condición o condiciones
		
		//Casi siempre para realizar la acción varias veces
		//para ello nos vamos a apoyar en una variable numérica
		//ya que de acuerdo al cambio del valor de la misma
		//es como se repetirá la acción o bloque de código
		
		//WHILE (Mientras se cumpla una condicion)
		
		int x = 1;
		
//		while (x<5) { //Mientras esta condición se cumpla
//			//Ejecutamos lo de AQUI ADENTRO
//			System.out.println("Hola mundo " + x);
//			//Puedo determinar el ciclo While indicando un incremento
//			//en la variable
//			//x = x + 1;
//			x++;
//		}
		
		//do-while - Similar al ciclo While, pero si por alguna razón
		//podemos encontrarnos con una condicion que no se cumpla
		//nos aseguramos de que nuestro programa se ejecute por lo menos
		//1 vez
		
//		do {//HAZ LO SIGUIENTE (Ejecuta lo siguiente)
//			System.out.println("Hola mundo");
//			x++;
//		}while(x<2);//MIENTRAS ESTO SE CUMPLA (Evaluamos si la acción se realiza de nuevo)
		
		
		//FOR - Ciclo determinado para un conjunto de "condiciones"
		//Se utiliza más cuando tenemos una idea de cuantas veces queremos
		//que se realice una acción
		
		//PARA (estas condiciones){
		//ejecutamos este bloque
		//}
		
		//PARA (variable de control; condicion; incremento)
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Hola mundo " + i);
		}
		
		

	}

}
