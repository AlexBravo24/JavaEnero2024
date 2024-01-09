package curso.arrays;

public class Arrays5_EGC {

	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos.

		String [] productos = {"Leffe", "Duvel", "Delirium", "Paulaner"};
		double [] precios = {54.00, 85.90, 128.00, 99.90};
		int lon = precios.length;
		int i = 0;
		System.out.println("Listado de productos...");
		while (i < lon) {
			System.out.println("Producto 1: " + productos[i] + " - Precio: " + precios[i]);
			i++;
		}
		
	}

}
