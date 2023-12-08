package advance_Java.Collctions.Set;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args){

		TreeSet<String> set = new TreeSet<>();

		set.add("Kapil");
		set.add("Priya");
		set.add("Kajal");
		set.add("Aman");
		set.add("Rohit");
		set.add("Sumit");
		set.add("Kapil");     // not allow duplicates
		set.add("");  // can store empty string

		// not allow null value - will throw NullPointerException


		System.out.println(set);
	}
}
