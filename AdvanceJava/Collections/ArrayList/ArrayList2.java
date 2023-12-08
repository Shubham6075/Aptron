package advance_Java.Collctions.ArrayList;

import java.util.*;

public class ArrayList2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// add method
		list.add("Shubham");
		list.add("Sunny");
		list.add("Sumit");
		list.add("Ankit");

		System.out.println("List : " +list );

		System.out.println("------------------------------");

		// remove method
		list.remove("Sumit");

		System.out.println("List after 1st removal : " +list);

		System.out.println("--------------------------------");

		// using iterable interface

		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("------------------------------------");

		// using for each loop
		for(String z : list){
			System.out.println(z);
		}

		System.out.println("---------------------------------------");

		// sort the list
		Collections.sort(list);

		System.out.println("Sorted : " +list);

		System.out.println("--------------------------------------");

		// using for loop
		// Sort the list (ascending order) using a for loop (bubble sort)
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					// Swap elements
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}

		System.out.println("Sorted List: " + list);

	}
}
