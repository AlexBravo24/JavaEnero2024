package curso.ciclos;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        // Número para el cual se generará la tabla de multiplicar
        int numero = 12;

        // Imprimir la tabla de multiplicar del 12
        System.out.println("Tabla de multiplicar del 12:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}

