package advance_Java.Collctions.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size : ");
		int n = scanner.nextInt();

		System.out.println("---------------------");

		// take input from user
		for(int i=0; i<n; i++){
			System.out.print("Value at " +i +" : " );
			int value = scanner.nextInt();
			list.add(value);
		}

		System.out.println("----------------");

		System.out.println("List : " +list);

		System.out.println("------------------");

		// sum of array list

		int sum = 0;

		for(int x : list){
			sum = sum+x;
		}

		System.out.println("Sum of list : " +sum);

	}
}
