package core_java1.OOPs;

public class cc {      // method overloading example
	public static void main(String[] args) {

		sum(5,7);
		sum(5,7,8);
		sum(5.0,9.0);
	}

	public static void sum(int a , int b ){
		System.out.println(a+b);
	}

	public static void sum(int a, int b , int c){
		System.out.println(a+b+c);
	}

	public static void sum(double a, double b){
		System.out.println(a+b);
	}
}
