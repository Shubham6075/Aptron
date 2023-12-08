package core_java1.OOPs;

import java.util.Scanner;

public class ScannerImp {
	public static void main(String[] args){

		// creating scanner
		Scanner scanner = new Scanner(System.in);

		// String type
		System.out.println("Enter name of student : ");
		String name = scanner.nextLine();


		// int type
		System.out.println("Enter the age of student : ");
		int age = scanner.nextInt();

		// float type
		System.out.println("Enter the pocket money of student");
		float pocketMoney = scanner.nextFloat();

		// Double type
		System.out.println("Enter the percentage he scored by student ");
		double average = scanner.nextDouble();




		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Pocket Money : " +pocketMoney);
		System.out.println("Marks Average : " +average);
	}
}
