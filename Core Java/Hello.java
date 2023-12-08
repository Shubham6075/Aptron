package core_java1;

import java.util.Random;

public class Hello {
	public static void main(String[] args){

		String a = "Hello";
		String b = "User";

		System.out.println(a+" " +b);

		int x = 5;
		int y = 10;

		System.out.println("Max of two no's : " +Math.max(x,y));
		System.out.println("Min of two no's : " +Math.min(x,y));

		System.out.println("Square root of x  : " +Math.sqrt(x));

		System.out.println("Random no's : " +Math.random());

		System.out.println("----------------------------");

		// Create a Random object
		Random random = new Random();

		// Generate a random integer between 1 (inclusive) and 10 (exclusive)
		int randomInt = random.nextInt(10) + 1;
		System.out.println(randomInt);


	}
}
