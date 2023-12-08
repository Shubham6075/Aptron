package advance_Java.Collctions.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class L1 {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size : ");
		int n = scanner.nextInt();

		// take input from user
		for(int i=0; i<n; i++){
			System.out.print("Value at " +i +" : ");
			int value = scanner.nextInt();
			list.add(value);
		}

		System.out.println("List : " +list);

		System.out.println("---------------------------");

		// using iterator

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("-------------------------------");

		// remove element
		list.remove(1);

		System.out.println("List 1st removal " +list);
	}
}
