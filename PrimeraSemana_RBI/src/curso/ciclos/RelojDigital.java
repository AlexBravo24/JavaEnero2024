package curso.ciclos;

public class RelojDigital {
    public static void main(String[] args) {
        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    // Formatear y imprimir la hora
                    String horaFormateada = formatearNumero(horas) + ":" +
                                           formatearNumero(minutos) + ":" +
                                           formatearNumero(segundos);
                    System.out.println(horaFormateada);

                    // Dormir el hilo por 1 segundo para simular el paso del tiempo
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Función para formatear números de una o dos cifras con un 0 al frente
    private static String formatearNumero(int numero) {
        return (numero < 10) ? "0" + numero : String.valueOf(numero);
    }
}
