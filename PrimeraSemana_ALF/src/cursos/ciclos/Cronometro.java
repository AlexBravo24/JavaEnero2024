package cursos.ciclos;

public class Cronometro {

	public static void main(String[] args) {
		
		for(int hora=0; hora<24; hora++) 
			for (int minuto=0; minuto<60; minuto++) {
				for (int segundo=0; segundo<60; segundo++) {
					System.out.println("Hora: "+hora+" minutos: "+minuto+" segundos: "+ segundo);
				}
			}
				
				
		

	}

}
