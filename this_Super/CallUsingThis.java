package this_Super;


	class Example {
		   int x;
		   int y;

		   Example() {
		      this(10, 20);
		   }

		   Example(int x, int y) {
		      this.x = x;
		      this.y = y;
		   }

		   void printData() {
		      System.out.println("x = " + x);
		      System.out.println("y = " + y);
		   }
		}

		public class CallUsingThis {
		   public static void main(String[] args) {
		      Example obj1 = new Example();
		      System.out.println("Using object:");
		      System.out.println("x = " + obj1.x);
		      System.out.println("y = " + obj1.y);

		      System.out.println("\nWithout using object:");
		      obj1.printData();
		   }
		}

		

