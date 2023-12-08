package advance_Java.Collctions.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		// Add Person objects to the list
		list.add(new Student(1,"Alice", 25));
		list.add(new Student(2,"Bob", 20));
		list.add(new Student(3,"Charlie", 30));
		list.add(new Student(4,"David", 22));

		System.out.println("Original List:");
		printList(list);

		selectionSort(list);

		System.out.println("Sorted List (by age):");
		printList(list);
	}

	public static void selectionSort(List<Student> list) {
		int n = list.size();

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (list.get(j).getAge() < list.get(minIndex).getAge()) {
					minIndex = j;
				}
			}

			// Swap the minimum element with the current element
			Student temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
	}

	public static void printList(List<Student> list) {
		for (Student person : list) {
			System.out.println(person);
		}
		System.out.println();
	}


}
