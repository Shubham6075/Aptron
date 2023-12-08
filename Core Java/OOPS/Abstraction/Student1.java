package core_java1.OOPs.Abstraction;

public class Student1 extends Student{

	@Override
	public void student() {
		System.out.println("This side Shubham");
		super.welcomeMessage(); // Call the regular method using super
	}

	@Override
	public void age(){
		System.out.println("My age is 22");
	}
}
