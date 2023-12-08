package core_java1.ExceptionHandling;


public class E {
	public static void main(String[] args){

		try{
			int[] num = {1, 2, 3};
			System.out.println(num[10]);
		}catch(Exception ex){
			System.out.println(ex);
			System.out.println("Something went wrong.......");
		}finally {
			System.out.println("This is custom exception message");
			System.out.println("Finally block will always run whether exception caught or not");
		}
	}
}
