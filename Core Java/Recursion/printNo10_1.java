package core_java1.Recursion;

public class printNo10_1 {
	public static void main(String[] args) {

		int n = 10;
		System.out.println("Numbers from 10 to 1 : ");
		printNum(n);
	}

	public static void printNum(int n){

		if(n >= 1){
			System.out.println(n);
			printNum(n-1);
		}
	}
}
