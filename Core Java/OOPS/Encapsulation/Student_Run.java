package core_java1.OOPs.Encapsulation;

public class Student_Run {
	public static void main(String[] args){

		Student student = new Student("Shubham","Rohtak",30);

		System.out.println(student.getName());
		System.out.println(student.getCity());
		System.out.println(student.getAge());

		// Use setter methods to modify the object's state
		student.setName("Alice");
		student.setAge(25);
		student.setCity("Noida");

		// Use getter methods again to verify the changes
		System.out.println("Updated Name: " + student.getName());
		System.out.println("Updated Age: " + student.getAge());
		System.out.println("Updated City: " + student.getCity());

	}
}
