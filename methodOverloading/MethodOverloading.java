package methodOverloading;

class MethodOverloading {
	  public void print(int num1, int num2) {
	    System.out.println("First Method with two integer parameters: " + (num1 + num2));
	  }
	  
	  public void print(int num1, int num2, int num3) {
	    System.out.println("Second Method with three integer parameters: " + (num1 + num2 + num3));
	  }
	  
	  public void print(double num1, double num2) {
	    System.out.println("Third Method with two double parameters: " + (num1 + num2));
	  }
	  
	  public void print(double num1, int num2) {
	    System.out.println("Fourth Method with one double and one integer parameter: " + (num1 + num2));
	  }
	  
	  public int sum(int num1, int num2) {
	    return num1 + num2;
	  }
	  
	  public double sum(int num1, int num2, int num3) {
	    return num1 + num2 + num3;
	  }
	  
	  public static void main(String[] args) {
	    MethodOverloading obj = new MethodOverloading();
	    
	    obj.print(10, 20);
	    obj.print(10, 20, 30);
	    obj.print(10.5, 20.5);
	    obj.print(10.5, 20);
	    
	    System.out.println("Sum of two integers: " + obj.sum(10, 20));
	    System.out.println("Sum of three integers: " + obj.sum(10, 20, 30));
	  }
	}

