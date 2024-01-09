package ejerciciosCiclos;

public class Ejercicio5 {
	 public static void main(String[] args) {
	        double capitalInicial = 1000.00;
	        double tasaInteresMensual = 0.02;
	        int meses = 12;

	        for (int i = 0; i < meses; i++) {
	            capitalInicial += capitalInicial * tasaInteresMensual;
	        }

	        System.out.println("Después de un año, el capital será: $" + capitalInicial);
	    }
}
