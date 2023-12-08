package core_java1.Methods;

public class Method_Overloading {
	public static void main(String[] args) {

		System.out.println("Sum : " +sum(5,7));

		System.out.println("-----------------");

		System.out.println("Sum 3 no's : " +sum(5,7,9));

		System.out.println("-----------------------");

		System.out.println("Sum of double no's : " +sum(7.0,16.0));



	}

	public static int sum(int a, int b){
		return a+b ;
	}

	public static int sum(int a, int b, int c){
		return a+b+c;
	}

	public static double sum(double a, double b){
		return a+b;
	}
}
