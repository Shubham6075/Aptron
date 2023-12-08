package core_java1.ExceptionHandling;

public class throws_keyword {
	public static void main(String[] args) {
		try {
			processInput(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}

	public static void processInput(int number) throws IllegalArgumentException {
		if (number < 0) {
			throw new IllegalArgumentException("Input must be a positive number.");
		}
		// If the input is valid, continue processing.
		System.out.println("Processing input: " + number);
	}
}
