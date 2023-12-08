package advance_Java.Collctions.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args){

		HashSet<String> set = new LinkedHashSet<>();

		set.add("Kapil");       // duplicates not allowed
		set.add("Priya");
		set.add("Kajal");
		set.add("Aman");
		set.add("Rohit");
		set.add("Sumit");
		set.add("Kapil");
		set.add(null);            // only one null value allowed
		set.add(null);

		System.out.println(set);
	}
}
