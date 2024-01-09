package curso.arrays;

public class Arrays5_LDGR {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro 
		// para mostrar sus respectivos precios. Muestra en 
		// consola la lista de productos y sus precios. 
		// Por lo menos 5 productos o artículos
		
        String[] productos = new String[5];
		
		productos[0]="Azúcar";
		productos[1]="Leche";
		productos[2]="Cono de huevo";
		productos[3]="Frijol";
		productos[4]="Yogur";
		
		int[] precios = new int[5];
		
		precios[0]=20;
		precios[1]=15;
		precios[2]=70;
		precios[3]=30;
		precios[4]=56;
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(productos[i] + " $" + precios[i]);
		}

	}

}
