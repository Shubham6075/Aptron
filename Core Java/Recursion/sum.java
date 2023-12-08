package core_java1.Recursion;

public class sum {
	public static void main(String[] args) {

		int result = sum2(10);
		System.out.println("Sum till 10 : " +result);
	}

	public static int sum2(int x){
		if(x > 0){
			return x + sum2(x-1);
		}else{
			return 0;
		}
	}
}
