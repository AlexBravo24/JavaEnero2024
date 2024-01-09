package curso.arrays;

public class Ejercicio5 {
	 public static void main(String[] args) {
	        String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
	        double[] precios = {10.50, 20.00, 15.75, 30.25, 25.50};

	        System.out.println("Lista de Productos y Precios:");
	        System.out.println("------------------------------");
	        for (int i = 0; i < productos.length; i++) {
	            System.out.println(productos[i] + ": $" + precios[i]);
	        }
	    }
}
