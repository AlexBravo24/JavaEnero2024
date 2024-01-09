package curso.ciclos;

public class Ciclos5_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 1000;
		
		
		for (int m = 1; m < 13; m++) {
			x = (x + (x * .02));
		System.out.println("me0s " + m + " = $" + x);
		}
		System.out.println("la invesion ahora asciende a: $" + x);
	}

}
