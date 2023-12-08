package advance_Java.Collctions.ArrayList;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Shubham");
		list.add("Sumit");
		list.add("Yash");

		// add method using index
		list.add(0,"Yogesh");

		System.out.println(list);

		System.out.println("---------------------");

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("-------------------");

		list.remove(2); // remove using index

		System.out.println(list);

		System.out.println("----------------");

		list.remove("Yogesh"); // remove using object

		System.out.println(list);

		System.out.println("----------------");

		// if we have duplicates element than it will remove first value and other remain in list
		list.add("Sumit");
		list.add("Sumit");
		list.add("Sumit");
		list.add("Sumit");
		list.add("Sumit");

		System.out.println(list);

		System.out.println("--------------------");

		while(list.contains("Sumit")){
			list.remove("Sumit");
		}

		System.out.println(list);

		/*
		// Element to remove
		String elementToRemove = "Sumit";

		// Iterate through the list in reverse order to avoid index shifting
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(elementToRemove)) {
				list.remove(i);
			}
		}

		System.out.println("List with 'Sumit' Removed:");
		System.out.println(list);

		 */

	}

}
