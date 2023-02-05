package this_Super;

	
	class Parent {
		   int x;
		   int y;

		   Parent(int x, int y) {
		      this.x = x;
		      this.y = y;
		   }

		   void printData() {
		      System.out.println("x = " + x);
		      System.out.println("y = " + y);
		   }
		}

		class Child extends Parent {
		   int z;

		   Child(int x, int y, int z) {
		      super(x, y);
		      this.z = z;
		   }

		   void printData() {
		      super.printData();
		      System.out.println("z = " + z);
		   }
		}

		public class CallUsingSuper {
		   public static void main(String[] args) {
		      Child obj = new Child(10, 20, 30);

		      System.out.println("Using object:");
		      System.out.println("x = " + obj.x);
		      System.out.println("y = " + obj.y);
		      System.out.println("z = " + obj.z);

		      System.out.println("\nWithout using object:");
		      obj.printData();
		   }
		}


