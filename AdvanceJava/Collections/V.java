package advance_Java.Collctions.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class V {
	public static void main(String[] args) {

		List<Integer> list = new Vector<>();

		list.add(3);
		list.add(6);
		list.add(9);
		list.add(87);
		list.add(7);

		System.out.println("List : " +list);

		System.out.println("--------------------------");

		// using iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
