package abstractClass;
	
	//1. Creating an abstract class with abstract and non-abstract methods
	abstract class Shape {
	// abstract method
		abstract void draw();
	
	// non-abstract method
		void fillColor(String color) {
			System.out.println("Filling color: " + color);
		}
	}
	
	//2. Creating a sub-class for the abstract class
	class Circle extends Shape {
	// overriding abstract method
		void draw() {
			System.out.println("Drawing Circle");
		}
	}
	
	public class AbstractClassExample {
		public static void main(String[] args) {
			Circle circle = new Circle();
	
			// Accessing abstract method
			circle.draw();
	
			// Accessing non-abstract method
			circle.fillColor("red");
		}
	}
