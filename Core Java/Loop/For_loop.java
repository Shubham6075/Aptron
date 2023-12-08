package core_java1.Loops;

import java.util.Scanner;

public class For_loop {
	public static void main(String[] args) {

		// print table of number using for loop
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value to get table : ");
		int n = scanner.nextInt();

		System.out.println("-----------------------------");

		for(int i=1; i<=10; i++){

			System.out.println(n+" x " +i +" : " +n*i);
		}
	}
}
