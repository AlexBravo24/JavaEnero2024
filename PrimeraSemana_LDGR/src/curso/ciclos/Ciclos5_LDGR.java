package curso.ciclos;

class Ciclos5_LDGR {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le 
		// otorga un 2% de inter�s mensual. �Cu�l ser� la cantidad de 
		// dinero que esta persona tendr� al cabo de un a�o si todo 
		// el dinero lo reinvierte?
		
//		int inversion=1000;
//		double interes=0.02;
//		double mensual=inversion*interes;
//		
//		
//		for (int mes = 1; mes < 13; mes++) {
//			double resultado= mensual*mes;
//			System.out.println(resultado);
//
//		}
//		
//		System.out.println("Su dinero al final del a�o ser� de: " + ((mensual*12)+inversion));
		
		double x = 1000;
		
		for (int m = 1; m < 13; m++) {
			x=(x+(x*0.02));
			
			System.out.println("Mes " + m + " = $" + x);
		}
		
		System.out.println("La inversi�n ahora asciende a: $"+ x);
		

	}

}
