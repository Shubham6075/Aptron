package core_java1.Assignment;

public class pattern4 {
	public static void main(String[] args) {

		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if( i == 5
						|| j == 6 && (i >=2 && i<=8)
						|| j == 7 && (i>2 && i<8)
						|| j == 8 &&(i>3 && i<=6)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
