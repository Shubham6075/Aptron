package advance_Java.Collctions.Set;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args){

		HashSet<String> set = new HashSet<>();
		set.add("Kapil");
		set.add("Priya");
		set.add("Kajal");
		set.add("Aman");
		set.add("Rohit");
		set.add("Sumit");
		set.add("Kapil");
		set.add(null);
		set.add(null);

		System.out.println(set);


	}
}
