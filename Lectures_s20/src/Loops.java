import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		// Feb. 26 -- Loops & Iterations
		Scanner userInput = new Scanner(System.in);
		Random myGen = new Random();

		// Sample data -- Grades for a quiz worth 30 points
		int[] datos = {11, 22, 14, 15, 7, 30, 1, 15, 17,
				18, 21,  23, 25, 27, 13, 19, 22, 14, 17,
				25, 26, 28, 29, 30, 31, 5, 7, 10, 11,
				23, 27, 24, 18, 16, 26, 27, 29};

		// Average (classic for-loop)
		int total = 0;
		int count = 0;
		double average = 0.0;
		for (int i = 0; i < datos.length; i++) {
			total = total + datos[i];
			count++;  // count = count + 1, count += 1
		}
		average = (double) total / count;
		//System.out.println("Average: " + average);
		//System.out.printf("Average: %.2f", average);

		//System.out.printf("Average: %.2f", (double) total / count);		

//		for( ; ; ) {
//			System.out.println("Hello Again ...");
//		}
		
		// While & Do-While Loops
		// 10, 9, 8, .... 0 Blast-off
//		int t = 10;
//		while(t > 0) {
//			System.out.println("T-minus - " + t);
//			t--; // t=t-1, t -= 1
//		}
//		System.out.println("Blast-Off");
		
		// Bar chart |***********
//		System.out.print("\n|");
//		int value = 7;
//		while (value > 0) {
//			System.out.print(" * ");
//			value--;
//		}
		
//		System.out.print("\n|");
//		int value = 7;
//		do {
//			System.out.print(" * ");
//			value--;
//		} while (value > 0);
		
//		boolean valid = false;
//		double hours = 0.0;
//		while(!valid) {
//			System.out.print("\nEnter hours: "); // prompt
//			hours = userInput.nextDouble();
//			if (hours >= 0.0 && hours <= 60.0) {valid = true;}
//			else {System.out.println("Invalid hours, try again");
//			}
//		}
//		System.out.println("Salary: " + hours*8.25);
		
//		boolean valid = false;
//		double hours = 0.0;
//		do {
//			System.out.print("\nEnter hours: "); // prompt
//			hours = userInput.nextDouble();
//			if (hours >= 0.0 && hours <= 60.0) {valid = true;}
//			else {System.out.println("Invalid hours, try again");}
//		} while(!valid);
//		System.out.println("Salary: " + hours*8.25);
		
		//boolean valid = false;
//		double hours = 0.0;
//		do {
//			System.out.print("\nEnter hours: (between 0 and 60)"); // prompt
//			hours = userInput.nextDouble();
//		} while(!(hours >= 0.0 && hours <= 60.0));
//		System.out.println("Salary: " + hours*8.25);
	
		
		// Common (Loop) Algorithms: Count, Average, Max, Min, Find
		
		// count: total # of datos
//		count = 0;
//		for (int d : datos) {
//			count++;
//		}
//		System.out.println("Count: " + count);
//		
//		total =0;
//		// average
//		for (int d : datos) {
//			total += d;
//		}
//		//System.out.printf("Average %.2f", (double)total/count);
//		System.out.printf("Average %.2f", (double)total/datos.length);
		
		// max
		//int max = datos[0];
//		int max = datos[0];
//		for (int d : datos) {
//			if (d > max) max=d;
//		}
//		System.out.println("Max: " + max);
		
//		// min
//		//int min = 0;
//		int min = datos[0];
//		for (int d : datos) {
//			if (d < min) min=d;
//		}
//		System.out.println("Min: " + min);
		
		// find
//		boolean anyPerfect = false;
//		for (int d : datos) {
//			if (d == 30) {
//				anyPerfect = true;
//				break;
//			}
//		}
//		System.out.println("Any Perfect Scores? " + anyPerfect);
		
		
	// Bonus
		int bonus = 3;
//		for (int d : datos) {
//			d = d + bonus;
//		}
		
		for (int i = 0; i < datos.length; i++) {
			datos[i] = datos[i] + 3;  // datos[i] += 3
		}
		
		total = 0;
		// average
		for (int d : datos) {
			total += d;
		}
		System.out.printf("Average %.2f", (double)total/datos.length);	
		
		
		
		
		
		
		
		
}
}

