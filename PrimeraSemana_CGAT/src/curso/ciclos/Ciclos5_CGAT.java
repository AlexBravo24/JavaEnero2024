package curso.ciclos;

public class Ciclos5_CGAT {

	public static void main(String[] args) {
		//  Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		double x = 1000;
		
		for (int i = 1; i < 13; i++) {
			x = (x + (x * .02));
			System.out.println("mes" + i + " = $ " + x);
			
		}
		System.out.println("La inversi�n asciende a: $" + x);

	}

}
