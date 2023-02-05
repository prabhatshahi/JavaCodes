package arrays;

public class MissingNumber {
	  public static int findMissingNumber(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != (i + 1)) {
	                return i + 1;
	            }
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
	        int missingNumber = findMissingNumber(arr);
	        if (missingNumber != -1) {
	            System.out.println("Missing number: " + missingNumber);
	        } else {
	            System.out.println("No missing number found");
	        }
	    }
	}



