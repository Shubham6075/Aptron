package core_java1.Assignment;

public class pattern3 {
	public static void main(String[] args) {
		int n = 5; // Change this value to adjust the size of the pattern

		//  top part
		for (int i = 1; i <= n; i++) {
			//  spaces
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Print the middle part of the pattern
		for (int i = 1; i <= 10; i++) {
				System.out.print("*");

		}
		System.out.println();

		// Print the bottom part of the mirror pattern
		for (int i = n; i >= 1; i--) {
			// Print leading spaces
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
