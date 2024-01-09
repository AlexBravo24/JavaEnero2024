package curso.ciclos;

public class Ciclos5_CGAT {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		double x = 1000;
		
		for (int i = 1; i < 13; i++) {
			x = (x + (x * .02));
			System.out.println("mes" + i + " = $ " + x);
			
		}
		System.out.println("La inversión asciende a: $" + x);

	}

}
