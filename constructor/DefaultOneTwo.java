package constructor;

class Example {
	   int x;
	   int y;

	   Example() {
	      System.out.println("Default constructor called");
	   }

	   Example(int x) {
	      this();
	      this.x = x;
	   }

	   Example(int x, int y) {
	      this(x);
	      this.y = y;
	   }

	   void printData() {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	   }
	}

	public class DefaultOneTwo {
	   public static void main(String[] args) {
	      Example obj1 = new Example();
	      System.out.println("\nOne argument constructor called");
	      Example obj2 = new Example(10);
	      System.out.println("\nTwo argument constructor called");
	      Example obj3 = new Example(10, 20);
	      obj3.printData();
	   }
	}

