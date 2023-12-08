package core_java1.Conditionals;

public class Continue {    // continue keyword : only value 5 not get print
	public static void main(String[] args) {

		for(int i=0; i<10; i++){
			if(i == 5){
				continue;
			}
			System.out.println(i);
		}
	}
}
