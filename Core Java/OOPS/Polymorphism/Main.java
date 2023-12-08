package core_java1.OOPs.Polymorphism;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Horse horse = new Horse();

		animal.animalName();
		cow.animalName();
		dog.animalName();
		horse.animalName();
	}
}
