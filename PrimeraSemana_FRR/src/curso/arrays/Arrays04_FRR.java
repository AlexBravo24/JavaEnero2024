package curso.arrays;

public class Arrays04_FRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num [] = new int [5];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("El numero " + num[i] + " se encuentra en la posicion " + (i + 1));
			
		}
		
		int numinv [] = new int [5];
		
		for (int b = 0; b < 5; b++) {
			
			numinv[b] = num.length - (b + 1); 
			
			System.out.println("Ahora el numero " + num[b] + " se encuentra en la posicion " + (5 - b));
			
		}
				
	}
	
	}

