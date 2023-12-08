package core_java1.OOPs.Inheritance;

public class Main extends Student{

	public String name = "Alok";
	public static void main(String[] args) {

		Main obj = new Main();

		obj.myMethod();
		System.out.println(obj.name);
		System.out.println(obj.course);



	}
}
