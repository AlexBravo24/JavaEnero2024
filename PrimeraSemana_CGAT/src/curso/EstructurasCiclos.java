package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CICLOS o tambi�n BUCLES
		//Nos ayudan a ejecutar "n" veces una acci�n
		//de acuerdo a una condici�n
		
		//Casi siempre para realizar una acci�n varioa veces
		//para ello nos vamos a apoyar en una variable numerica
		//ya que de acuerdo al valor de la misma
		//es como se repetir� la acci�n o bloque del c�digo
		
		//WHILE (Mientras se cumpla una condici�n)
		
		int x = 1;
//		while (x<5) { //Mientras la condici�n se cumpla
//			//Ejecutamos lo de AQUI ADENTRO
//			System.out.println("Hola mundo " + x);
//			//Puedo determinar el ciclo While indicanto un incremento
//			//en la variable
//			//x = x + 1;
//			x++;			
//		}
			//do while - Similar al ciclo while, pero si por alguna raz�
			//nos encontramos con una condici�n que no se cumpla
			//nos aseguramos de que nuestro programa se ejecute por lo menos
			// 1 vez
		
//		do {
//			System.out.println("Hola mundo");
//		}while (x>2);//Evaluamos si la acci�n se realiza de nuevo
		
		//FOR - Ciclo determinado para un conjunto de "condiciones"
		//Se utiliza mas cuando tenemos una idea de cuantas veces queremos
		//que se realice una acci�n
		
		//Para (estas condiciones){
		//ejecutamos este bloque
		//}
		
		//PARA(variable de control; condicion; incremento)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo " + i);
		}
		
		

		
	}

}
