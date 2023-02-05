package interface_example;

//1. Creating an interface with only one method
interface Printable {
	void print();
}

//2. Implementing the interface in a class and calling the method
class Document implements Printable {
	public void print() {
		System.out.println("Printing Document");
	}
}

//3. Using Interface instances to call the implemented method in the implemented class
public class InterfaceOneMethod {
	public static void main(String[] args) {
		Printable document = new Document();
		document.print();
	}
}

//4. Creating two interfaces with one method each and implementing these two interfaces in one class
interface Scanner {
	void scan();
}

interface Copier {
	void copy();
}

class MultiFunctionPrinter implements Scanner, Copier {
	public void scan() {
		System.out.println("Scanning Document");
	}

	public void copy() {
		System.out.println("Copying Document");
	}
}

//5. Creating two interfaces with the same method (same signature) in both the interfaces and implementing these two interfaces in one class and calling the method
interface Drawable {
	void draw();
}

interface Paintable {
	void draw();
}

class Canvas implements Drawable, Paintable {
	public void draw() {
		System.out.println("Drawing on Canvas");
	}
}

//6. Creating an interface with a default method and implementing it in a class, do not provide implementation to the default method and call the method
interface Shape {
	void area();

	default void perimeter() {
		System.out.println("Calculating Perimeter");
	}
}

class Circle implements Shape {
	public void area() {
		System.out.println("Calculating Area");
	}
}

//7. Creating an interface and inheriting it from the other interface
interface CircleProperties extends Shape {
	void circumference();
}

class CircleMeasurements implements CircleProperties {
	public void area() {
		System.out.println("Calculating Area");
	}

	public void circumference() {
		System.out.println("Calculating Circumference");
	}
}

//8. Creating a PUBLIC interface with fields and methods, fields should have values assigned, implement this interface to some class and print the values of the interface fields and call the interface methods
interface PrintDetails {
	int COPIES = 10;
	String PRINTER_NAME = "HP Printer";

	void print();
}

class DocumentDetails implements PrintDetails {
	public void print() {
		System.out.println("Printing Document");
		System.out.println("Number of Copies: " + COPIES);
		System.out.println("Printer Name: " + PRINTER_NAME);
	}
}
