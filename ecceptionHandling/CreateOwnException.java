package ecceptionHandling;


class InvalidAgeException extends Exception {
	  public InvalidAgeException(String message) {
	    super(message);
	  }
	}

	class CreateOwnException {
	  static void validateAge(int age) throws InvalidAgeException {
	    if (age < 18) {
	      throw new InvalidAgeException("Age must be greater than or equal to 18");
	    }
	  }
	  
	  public static void main(String[] args) {
	    try {
	      validateAge(16);
	    } catch (InvalidAgeException e) {
	      System.out.println("InvalidAgeException occurred: " + e.getMessage());
	    }
	  }
	}





