package curso.ciclos;

public class Ciclos5_AMGC {

	public static void main(String[] args) {
		/* 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		 * mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		 * todo el dinero lo reinvierte?
		 */
		
		double inv;
		double rendimiento;
		int mes;
		
		inv=1000;
		for (mes=1; mes<=12; mes++) {
			rendimiento=inv*0.02;
			inv=inv+rendimiento;
		}
		
		System.out.println("Al cabo de un a�o tendr� $" + inv);

	}

}
