package core_java1.Conditionals;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value : ");

		int day = scanner.nextInt();

		switch(day){
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid day");

		}

		System.out.println("------------------------------------");

		String[] daysOfWeek = {
				"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
		};

		for (int d = 1; d <= 7; d++) {
			System.out.println(daysOfWeek[d - 1]);
		}


	}
}
