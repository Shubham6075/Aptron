package core_java1.Loops;

import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value to print table : ");
		int n = scanner.nextInt();

		System.out.println("----------------------------");

		int i=1;

		do{
			System.out.println(n+" x " +i +" : " +n*i);
			i++;
		}while(i<11);
	}
}
