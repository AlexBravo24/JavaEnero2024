package curso;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		//CICLOS O TAMBIEN LLAMADOS BUCLES
		//NOS AYUDAN A EJECUTAR N VECES UNA ACCION DE ACUERDO A UNA CONDICION 
		//O CONDICIONES 
		
		//CASI SIEMPRE PARA REALIZAR LA ACCION VARIAS VECES PARA ELLO
		//NOS VAMOS A APOYAR EN UNA VARIABLE NUMÉRICA
		//YA QUE DE ACUERDO AL CAMBIO DE LA MISMA ES COMO SE REPETIRÁ LA ACCIÓN
		//O BLOQUE DE CODIGO
		
		//------WHILE (MIENTRASS SE CUMPLA UNA CONDICION)--------
		
		int x = 1;
		
//		while(x < 5) { //mientras esta condicion se cumpla
//			//ejecutamos lo de aqui adentro
//			System.out.println("hola mundo " + x);
//			//puedo determinar el ciclo while indicando un incremento en la variable
//			//x = x + 1; que es lo mismo que x++
//			x++;
//		}
		
		//-------do-while - similar al ciclo while, pero si por alguna razon podemos encontrarnos
		//con una condicion que no se cumpla, nos aseguramos de que nuestro programa se 
		//ejecute al menos una vez
		
//		do { //has o ejecuta lo siguiente
//			System.out.println("hola mundo");
//			x++
//		}while(x>2); //evaluamos si la accion se realiza de nuevo  
		
		//FOR - CICLO DETERMINADO PARA UN CONJUNTO DE CONDICIONES 
		//SE UTILIZA MAS CUANDO TENEMOS UNA IDEA DE CUANTAS VECES QUEREMOS
		//QUE SE CUMPLA UNA CONDICION 
		
		//PARA (ESTAS CONDICIONES){
		//EJECUTAMOS ESTE BLOQUE
		//}
		
		//PARA (VARIABLEDE CONTROL; CONDICION; INCREMENTO)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("hola mundo "+ i);
			}

	}

}
