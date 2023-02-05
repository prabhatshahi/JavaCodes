package java_basic;

public class Example {
	  // class fields
	  private int x;
	  private int y;
	  
	  // constructor
	  public Example(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  
	  // method signature
	  public int addNumbers(int x, int y) {
	    // method body
	    return x + y;
	  }
	  
	  public static void main(String[] args) {
	    // creating object of the class
	    Example obj = new Example(10, 20);
	    
	    // calling the method on the object
	    int result = obj.addNumbers(obj.x, obj.y);
	    
	    System.out.println("Result: " + result);
	  }
	}
