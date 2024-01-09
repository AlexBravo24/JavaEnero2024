package curso.ciclos;

public class Ciclos4_EGC {

	public static void main(String[] args) {
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		// minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		// horas

		for (int hora = 0; hora < 24; hora++) {
			for (int min = 0; min < 60; min++) {
				for (int sec = 0; sec < 60; sec++) {
					System.out.println(hora + ":" + min + ":" + sec);
					try {
                        // Pausa de 1 segundo (1000 milisegundos)
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // Manejar la excepción si es lanzada
                        e.printStackTrace();
                    }
				}
			}
		}

	}
}
