package ecceptionHandling;

public class FinallyBlock {
	
	public static void main(String[] args) {
	    try {
	      int[] numbers = {1, 2, 3};
	      System.out.println(numbers[3]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
	    } finally {
	      System.out.println("This is the finally block");
	    }
	  }

}
