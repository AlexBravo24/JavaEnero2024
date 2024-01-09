package curso.arrays;

public class Arrays5_AMGC {

	public static void main(String[] args) {
		
		/* 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios.
		 * Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		 */
		
		String [] productos = {"manzana", "platano", "mango", "naranja", "uva", "kiwi"};
		String [] precios = {"$32", "$20", "$64", "$28", "$74", "$43"};
		
		
		for (int i=0; i<6; i++) {
			System.out.println("El precio de " + productos[i] + " por kg es: " + precios[i]);
		}

	}

}
