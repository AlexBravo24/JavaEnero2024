package ejerciciosExtra;

public class Ciclos4_EGXCExtra {

	public static void main(String[] args) {
//		7- Una persona desea invertir $700.00 en un banco, 
//		el cual le otorga un 2% de inter�s mensual. 
//		En cuantos meses tendr� mas de $1500, 
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
		System.out.println("Le tomar� un total de " + meses + " meses llega a $1500 pesos");

	}

}
