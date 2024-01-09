package curso.arrays;

public class ArrayDeCienPosiciones {

	public static void main(String[] args) {
		System.out.println("ARRAY DE CIEN POSICIONES, SUMA Y MEDIA");
	
		
		int media, suma = 0; //Declaro dos variables de suma y media que aran operaciones mas adelante
        int[] numeros = new int[100]; //Declaro mi arreglo de 100 posiciones
        for (int i = 0; i < numeros.length; i++) {//usamos forma para meter nuestras condiciones 
        	//iniciando el conteo en l aposicion cero, icabara una posicion antes las posiicones declaradas
        	//y asu vez i ira incrementando
            numeros[i] = i+1;//i sera igual alo que tenga i mas 1 sera 1,2,3,4,5 cambiando de posicion asendiendo
            System.out.println(numeros[i]);
            suma += i+1;
        }
        media = suma / numeros.length;
        System.out.println("La suma da: "+ suma);
        System.out.println("La media es de: "+ media);

	}
	

}
