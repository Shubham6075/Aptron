package core_java1.Conditionals;

public class Break {   // break keyword : break the loop automatically when i = 8 ( no other value print)
	public static void main(String[] args) {

		for(int i=0; i<15; i++){
			if(i == 9){
				break;
			}
			System.out.println(i);
		}
	}
}
