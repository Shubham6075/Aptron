package core_java1.Assignment;

public class Pattern1 {
	public static void main(String[] args){

		/*
		     *
		       *
		         *
		 **********
		         *
		       *
		     *

		 */

		// row loop
		for(int i=0; i<10; i++){
			// column loop

			for(int j=0; j<10; j++){
				if( i == 5 || ((i == 2 || i == 8)&& j == 6)
						|| ((i == 3 || i == 7 )&& j == 7)
						|| ((i == 4 || i == 6) && j == 8)){
					System.out.print("*" + " ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
