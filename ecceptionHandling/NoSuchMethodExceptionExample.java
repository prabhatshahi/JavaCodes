package ecceptionHandling;

public class NoSuchMethodExceptionExample {
	  public static void main(String[] args) {
	    try {
	      Class c = Class.forName("java.lang.String");
	      Method m = c.getMethod("nonexistentMethod");
	    } catch (NoSuchMethodException e) {
	      System.out.println("NoSuchMethodException caught: " + e.getMessage());
	    } catch (ClassNotFoundException e) {
	      System.out.println("ClassNotFoundException caught: " + e.getMessage());
	    }
	  }
	}
