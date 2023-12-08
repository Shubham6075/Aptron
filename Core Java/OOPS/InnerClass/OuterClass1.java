package core_java1.OOPs.InnerClass;

@SuppressWarnings("ALL")
public class OuterClass1 {
	private int outerData;

	// Constructor for the outer class
	public OuterClass1(int data) {
		this.outerData = data;
	}

	// Getter for outerData
	public int getOuterData() {
		return outerData;
	}

	// Inner class
	public class InnerClass {
		private int innerData;

		// Constructor for the inner class
		public InnerClass(int data) {
			this.innerData = data;
		}

		// Getter for innerData
		public int getInnerData() {
			return innerData;
		}
	}

	public static void main(String[] args) {
		OuterClass1 outerObject = new OuterClass1(10);

		// Creating an instance of the inner class
		OuterClass1.InnerClass innerObject = outerObject.new InnerClass(20);

		// Accessing data from both outer and inner classes
		System.out.println("Outer Data: " + outerObject.getOuterData());
		System.out.println("Inner Data: " + innerObject.getInnerData());
	}
}

/*
In this example, we have an OuterClass that contains an inner class called InnerClass.
Here's how you can use inner classes and where they can be useful:

Encapsulation: Inner classes can be used to encapsulate and group related code together. For example,
the inner class can access private members of the outer class, allowing you to maintain encapsulation
while providing specific functionality.

Organization: Inner classes help organize code within a single class, making it more readable and
easier to manage. You can group related functionality in separate inner classes.

Specialization: Inner classes can be specialized to provide certain functionality within the context
of the outer class. In the example, the inner class specializes in dealing with inner data.

Scoping: Inner classes can access private members of the outer class, which can be useful for
restricting access to certain components of the outer class.

Listener and Callback Patterns: Inner classes are often used in event handling, such as implementing
listener or callback patterns, where the inner class responds to events or actions.

Multithreading: Inner classes can be useful in multithreading scenarios where you need to work with
threads and synchronize them within the context of the outer class.

The main method demonstrates how to create instances of both the outer and inner classes and how
to access their respective data. Inner classes are a powerful concept that helps with code
organization and encapsulation in Java.
 */
