package ciclos.curso_AUCDO;

import java.util.Scanner;

public class ciclos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int n=12;
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i +"x"+ n +" = "+i*n);
//		}
		
		
		
		

//		int a, b;
//		
//		System.out.println("Que numero desea multiplicar?");
//		a = sc.nextInt();
//		
//		System.out.println("Hasta que numero?");
//		b = sc.nextInt();
//		
//		for (int i = 1; i <= b; i++) {
//			System.out.println(i + "x" + a + " = "+i*a);
//		}
		
		
		
		
//		int horas = 0, minutos = 0, segundos = 0;
//		
//		while (true) {
//			
//			if(horas<10) {
//				System.out.print("0");
//				System.out.print(horas+":");
//			}
//			
//			
//			if(minutos<10) {
//				System.out.print("0");
//			}
//			System.out.print(minutos+":");
//			
//			if(segundos<10) {
//				System.out.print("0");
//			}
//			System.out.println(segundos);
//			
//			
//			segundos++;
//			
//			
//			if(segundos==60) {
//				segundos=0;
//				minutos++;
//				if(minutos==60) {
//					minutos=0;
//					horas++;
//					if(horas==24) {
//						horas=0;
//					}
//				}
//			}
//			
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}	
//			
		
		
		
	
		
		double dinero;
		System.out.println("Cuanto desea invertir?");
		dinero = sc.nextDouble();
		int mes = 1;
		
		while (mes<=12) {
			dinero = dinero*1.2;
			mes++;
			System.out.println(dinero);
		}
		System.out.println(dinero);
			
		
		
		
		
	}

}
