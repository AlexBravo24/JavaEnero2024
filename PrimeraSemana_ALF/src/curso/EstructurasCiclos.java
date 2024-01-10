package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS O TAMBIEN LLAMADOS BUCLES
		
	/*Nos ayudan a ejecutar "n" veces una accion*
	 * de acuerdo a una condicion o condiciones
	 * 
	 * casi simepre para realizar la accion varias veces
	 * para ello nos vamos apoyar en una variable numerica
	 * ya que deacuerdo al cambio del valor de la misma
	 * es como se repetira ña accion  o bloque de codigo
	 * 
	 * WHILE (Mientras se cumpla una condicion)*/
		
		int x =1;
//		 while(x<5) {//Mientras esta condicion se cumpla
//			 //se ejecuta lo de adentro
//			 System.out.println("Hola mundo");
//			 //puedo determinar el ciclo while indicandole un incremento
//			 //en la variable
//			 //x = x +1 ; es igual a x++;
//			 //El ciclo while solo acepta una condicion 
//			 x++;
//		 }
	
		//do-while - Similar al ciclo while, si por alguna razon 
		//podemos encontrarnos con una condicion que no se cumpla
		//nos aseguramos que nuestro porgrama se ejecute por lo menos
		// una vez
//		do {//Ejecutara una vez el programa x el mensaje de hola mundo
//			System.out.println("Hola mundo");
//		}while(x<2);//Evalua la condicion y la ejecuta una vez ya que es imposible 
//		//ejecutarla varias veces
		
		//FOR- Ciclo determinado para un conjunto de condiciones
		//se utuiliza cuando se tiene una idea de cuantas veces queremos
		//que se realize una accion
		//Para (estas condiciones){
		//ejecutamos este bloque
		//}
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Hola mundo "+ i);
		}
	}

}
