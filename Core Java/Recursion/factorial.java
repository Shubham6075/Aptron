package core_java1.Recursion;

public class factorial {
	public static void main(String[] args) {
		System.out.println("Factorial : " +facto(8));
	}

	public static int facto(int n ){

		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1; // Base case
		} else {
			return n * facto(n - 1); // Recursive call
		}

	}
}
