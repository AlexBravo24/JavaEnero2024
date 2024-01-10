package ejerciciosCiclos;

public class Ejercicio4 {
	public static void main(String[] args) {
        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    // Pausa para simular el tiempo transcurrido
                    try {
                        Thread.sleep(1000); // Pausa de 1 segundo (1000 milisegundos)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
	
}
