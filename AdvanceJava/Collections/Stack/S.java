package advance_Java.Collctions.Stack;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class S {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(3);
		stack.push(9);
		stack.push(8);
		stack.push(6);

		System.out.println("Stack : " +stack);

		System.out.println("-----------------------");

		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("--------------------");

		// remove
		System.out.println(stack.pop());

		System.out.println("----------------------");

		System.out.println("Stack 1st removal : " +stack);


	}
}
