package ecceptionHandling;

class ExceptionMethod {
	  public static void throwException() throws Exception {
	    throw new Exception("Exception thrown from the throwException method");
	  }
	}

	public class MethodThowException {
	  public static void main(String[] args) {
	    try {
	      ExceptionMethod.throwException();
	    } catch (Exception e) {
	      System.out.println("Caught Exception: " + e.getMessage());
	    }
	  }
	}
