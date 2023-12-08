package core_java1.Loops;

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value to print table : ");
		int n = scanner.nextInt();

		System.out.println("--------------------------");

		int i=1;

		while(i<11){
			System.out.println(n+" x " +i +" : " +n*i);
			i++;
		}
	}
}
