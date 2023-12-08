package core_java1.Recursion;

public class printNo {    // 1- 10
	public static void main(String[] args) {

		System.out.println("Numbers till condition : ");
		num(1);
	}

	public static void  num(int n){
		if(n <= 10){
			System.out.println(n);
			num(n+1);
		}
	}
}
