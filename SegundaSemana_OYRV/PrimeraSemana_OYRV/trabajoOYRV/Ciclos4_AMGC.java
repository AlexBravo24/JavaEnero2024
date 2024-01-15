package curso.ciclos;

public class Ciclos4_AMGC {

	public static void main(String[] args) {
		/* 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos
		 * y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		 */
		
		int hrs=0;
		int min=0;
		int seg=0;
		
		while (hrs<24) {
			while (min<60) {
				while (seg<60) {
					System.out.println(hrs + ":" + min + ":" + seg);
					seg++;
				}
				min++;
				seg=0;
			}
			min=0;
			hrs++;
		}
		
	}

}
