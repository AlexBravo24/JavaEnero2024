package ejerciciosExtra;

public class Udemy_Challenge1 {

	public static void main(String[] args) {
//				=====================
//				Sum 3 and 5 Challenge
//				=====================
//
//				*Create a for loop using a range of numbers from 1 to 1000 inclusive.
//
//				*Sum all the numbers that can be divided by both 3 and 5
//
//				*Print out the numbers that have met the above conditions
//
//				*break out of the loop once you have found 5 numbers that met the conditions.
//
//				*After breaking out of the loop, print the sum of the numbers that met the conditions.
//
//				*Note: type all code in the main method
		int sum = 0;
		int b = 0;
		int sumAll = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
				sumAll += sum;
				b++;
				System.out.println(sum);

				if (b == 5) {
					System.out.println(sumAll + " - " + b);
					break;
				}
			}
		}

	}

}
