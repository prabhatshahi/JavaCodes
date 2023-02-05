package this_Super;


	
	class Animal {
		   int age;

		   Animal() {
		      System.out.println("Animal Constructor");
		   }

		   Animal(int age) {
		      this();
		      this.age = age;
		   }
		}

		class Dog extends Animal {
		   int weight;

		   Dog() {
		      super(5);
		      System.out.println("Dog Constructor");
		   }

		   Dog(int age, int weight) {
		      super(age);
		      this.weight = weight;
		   }
		}

		public class ThisSuperMethods {
		   public static void main(String[] args) {
		      Dog dog = new Dog(10, 20);
		      System.out.println("Age: " + dog.age);
		      System.out.println("Weight: " + dog.weight);
		   }
		}



