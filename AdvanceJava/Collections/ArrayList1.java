package advance_Java.Collctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args){

		// homogeneous type : bcz we declared datatype here
		List<String> list = new ArrayList<>(Arrays.asList("Shubham","Ajay","Naveen","Sumit"));

		System.out.println(list);

		// heterogeneous type array list  : not declared datatype
		List<Object> list1 = new ArrayList<>();

		list1.add(2);
		list1.add("Shubham");
		list1.add(90.0);

		System.out.println(list1);
	}
}
