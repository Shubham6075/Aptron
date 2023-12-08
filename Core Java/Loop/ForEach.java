package core_java1.Loops;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value : ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		// take input from user
		for(int i=0; i<n; i++){
			System.out.print("Value at " +i +" : ");
			arr[i] = scanner.nextInt();
		}
		System.out.println();

		System.out.println("----------------------");

		// print the array using for each loop
		System.out.print("Array (for each loop): ");
		for(int z : arr){
			System.out.print(z + " ");
		}
		System.out.println();

		System.out.println("-------------------------");

		// using toString() function
		System.out.print("Array (using toString() : ");
		System.out.println(Arrays.toString(arr));

		System.out.println("---------------------------");

		// length
		System.out.println("Length : " +arr.length);

		System.out.println("----------------------------");

		// sum  of array

		int sum =0;

		for(int m : arr){
			sum += m;
		}
		System.out.println("Sum (array ) : " +sum);

		System.out.println("------------------------------");

		// average :
		double average = (double)sum / arr.length;

		System.out.println("Average : " +average);

	}
}
