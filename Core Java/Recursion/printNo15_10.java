package core_java1.Recursion;

public class printNo15_10 {
	public static void main(String[] args){
		System.out.println("print no from 10 to 15 in descending order : ");
		printNumbers(15,10);

		System.out.println("-------------------------");

		System.out.println("print no from 10 to 15 in descending order : ");
		printNo(15);

	}
	public static void printNumbers(int start, int end) {
		if (start >= end) {
			System.out.println(start);
			printNumbers(start - 1, end);
		}
	}


	public static void printNo(int num){
		if(num >=10){
			System.out.println(num);
			printNo(num-1);
		}
	}

}
