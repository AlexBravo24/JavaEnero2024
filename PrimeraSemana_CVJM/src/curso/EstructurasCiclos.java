package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o tambien llamados BUCLES
		//Nos ayudan a ejecutar N veces una accion de acuerdo
		//a una condicion o condiciones
		
		//Casi siempre para realizar la accion varias veces 
		//se necesita apoyarse en una variable numerica
		//ya que de acuerdo al cambio del valor de la misma 
		//es como se repetira la accion o bloque de código
		
		//WHILE
		//While - mientras se cumpla una condición
		//*PRIMERO SE EVALUA Y LUEGO SE EJECUTA
		
		int x= 1 ;
		while (x<=5) { //Mientras esta condicion se cumpla 
			//ENTONCES ejecutamos lo de AQUI DENTRO
			System.out.println("Hola Mundo con While" + x);
			//Puedo determinar el ciclo WHILE indicando un 
			//incremento en la variable 
			
			//x= x+1;
			//Otra forma de incrementar 1 en 1 la x es asi:
			x++;
		}
			//DO-WHILE
			//*PRIMERO SE EJECUTA Y DESPUES SE EVALUA
			//do-while - Similar al ciclo while, pero si por 
			//alguna razon podemos encontrarnos con alguna 
			//condicion que no se cumpla, nos aseguramos de que 
			//nuestro programa se ejecute por lo menos 1 vez{
			
			//Primero se hace y luego se evalua si se sigue 
			//haciendo
			
			do { //HAZ LO SIGUIENTE (Ejecuta lo siguiente)
				System.out.println("Hola mundo con DO");
			} while (x>2); //MIENTRAS ESTO SE CUMPLA
			// Evaluamos si la accion se realiza
			//de nuevo
			
			//SE USA PARA:
			//*Condiciones que no se pueden cumplir
			//*Numeros aleatorios 
			//*Para seguir pidiendo un dato (x ej contraseña)
			//* Por lo menos se ejecuta el programa una sola vez
			// y si es verdadera se siga ocupando
			
		
		
		//FOR
		//For- Ciclo determiado para un conjunto de "condiciones"
		//Se utiliza más cuando tenemos una idea de cuantas veces
		//queremos que se realice una accion
		
		//PARA (estas condiciones) {
		//ejecutamos este bloque
		//}
		
		//Para (variable de control; condicion (mientras) ;
		//incremento. Se repite
		//se incrementa 10 i+10
		
		for (int i = 0; i < 5; i+=10 ) {
		
			System.out.println("Hola mundo con FOR" + i);
		}
		
			

	}

		
		
}
