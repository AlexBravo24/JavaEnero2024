package curso.ciclos;

public class Ciclos5_CVJM {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 
		//en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de 
		//dinero que esta persona tendrá al cabo de un año 
		//si todo el dinero lo reinvierte? 
		
		int c=1000;
		double i= 0.02;
		int t=12;
		double m= c *(1+ i );
		
		
		while (t<13) {
			System.out.println("La inversion del mes "+ t+ " es un total de :"+m);
		t++;
		
		
		
		
		

	}

}
