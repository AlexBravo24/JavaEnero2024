package curso.ciclos;

public class Interes {
    public static void main(String[] args) {
        double capitalInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int meses = 12;
        
        for (int i = 0; i < meses; i++) {
        	capitalInicial += capitalInicial * tasaInteresMensual;
        }

        System.out.println("Despu�s de un a�o, el monto total ser�: $" + capitalInicial);
    }
}
