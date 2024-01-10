package ejerciciosExtra;

public class Ciclos4_EGXCExtra {

	public static void main(String[] args) {
//		7- Una persona desea invertir $700.00 en un banco, 
//		el cual le otorga un 2% de interés mensual. 
//		En cuantos meses tendrá mas de $1500, 
//		si reinvierte cada mes todo su dinero?.

		double inversion = 700;
		double interes = 0.02;
		double interesCompuesto = inversion;
		int meses = 0;
		while (interesCompuesto <= 1500) {
			double interesMensual = interesCompuesto * interes;
			interesCompuesto += interesMensual;
			//System.out.println(interesCompuesto);
			meses++;
		}
		System.out.println("Le tomará un total de " + meses + " meses llega a $1500 pesos");

	}

}
