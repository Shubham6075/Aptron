package core_java1.OOPs.Abstraction;

abstract class Student {

	// abstraction is used for data hiding ( abstract class & interfaces )

	// abstract class can contain both abstract method and regular method

	// abstract method don't have body ( if u give body to it  will give error )

	// for its body we need to override them in other class( subclass of the abstract class by using
	// extends keyword & there we can define body for abstract method)

	// and after that we create object of subclass ( bcz we can't create object of abstract class)

	// if we try to create objects using abstract class it will give error

	// then after creating object of subclass we can access both methods ( regular & abstract)

	// regular methods can also call by using super keyword in the overriding methods of abstract type

	// regular method don't need to override they can directly access by obj we created of subclass or
	// by using super keyword in the body of abstract method when we provide body to it in subclass
	// by extending it from abstract class

	public abstract void student();

	public abstract void age();

	public void myComplexion(){
		System.out.println("My complexion is fair");
	}

	public void welcomeMessage(){
		System.out.println("Welcome to Student Class !");
	}
}
