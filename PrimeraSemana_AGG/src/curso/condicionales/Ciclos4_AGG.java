package curso.condicionales;

public class Ciclos4_AGG {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo:
		//la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		int hora=0;
		int minuto=0;
		int segundo=0;
		
	for (hora=0; hora<24; hora++)
		for (minuto=0; minuto<60; minuto++)
			for(segundo=0; segundo<60; segundo++)
				{System.out.println("hora: " +hora+"minutos "+minuto+"segundos"+segundo);}
		
	}

}
