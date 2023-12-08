package core_java1.ExceptionHandling;

public class E1 {
	public static void main(String[] args){
		checkAge(16);

	}

	public static void checkAge(int age){
		if(age < 18) {
			throw new IllegalArgumentException("Access denied - your age must be greater than 18");
		}
			else{
				System.out.println("Access granted....");
			}
		}

}
