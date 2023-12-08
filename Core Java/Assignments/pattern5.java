package core_java1.Assignment;

public class pattern5 {
	public static void main(String[] args) {

		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(i == 5
						|| j == 1 && (i>3 && i<7)
						|| j == 2 && (i>2 && i<8)
						|| j == 3 && (i>1 && i<9)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
