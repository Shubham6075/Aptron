package advance_Java.Collctions.ArrayList;

public class Student {
	private final int rollNo;
	private final String name;
	private final int age;

	public Student(int rollNo,String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo(){
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"rollNo'= "+rollNo +'\''+
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

