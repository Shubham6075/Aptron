package core_java1;

import java.util.Random;

public class  RandomNumbersExample {
	public static void main(String[] args) {
		int min = 1;  // Minimum value
		int max = 100;  // Maximum value
		int numberOfRandomNumbers = 10;

		Random random = new Random();

		System.out.println("Generating 10 random numbers between " + min + " and " + max + ":");

		System.out.print("Random no's : ");

		for (int i = 0; i < numberOfRandomNumbers; i++) {
			int randomInt = random.nextInt(max - min + 1) + min;
			System.out.print(randomInt + " ");
		}
	}


}
