package cursos.ciclos;

public class Inversion {

	public static void main(String[] args) {
		
		double inversion= 1000;
		
		for(int i=1; i<13; i++) {
			inversion = (inversion + (inversion*.02));
			System.out.println("mes "+i+ " = $ "+ inversion);
		}
			System.out.println("La inversion es de: $ "+ inversion);

	}

}
