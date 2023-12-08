package core_java1.Recursion;

public class fibonacci {
	public static void main(String[] args) {
		int n = 10; // Number of Fibonacci numbers to generate

		System.out.println("Fibonacci Series:");

		for (int i = 0; i < n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int n ){
		if(n <= 1){
			return n;
		}else{
			return fibo(n-1) + fibo(n-2);
		}
	}
}
