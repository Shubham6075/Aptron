package core_java1.Methods;

public class BlockScope {
	public static void main(String[] args) {

		for(int i=0; i< 10; i++){   // block scope int his block i cna b use till end of curly braces anywhere
			System.out.println("I : " +i);
		}
	}
}
