package ecceptionHandling;

public class ArrayIndexOutOfBound {
	
	 public static void main(String[] args) {
		    int[] numbers = new int[5];
		    
		    try {
		      for (int i = 0; i <= numbers.length; i++) {
		        System.out.println("Number at index " + i + ": " + numbers[i]);
		      }
		    } catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
		    }
		  }

}
