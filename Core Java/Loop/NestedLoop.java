package core_java1.Loops;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();

		System.out.println("-------------------");

		// Outer loop
		for(int i=1; i<=n; i++){ // for rows

			// Inner loop
			for(int j=1; j<=n; j++){ // for column
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
