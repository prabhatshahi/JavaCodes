package arrays;

import java.util.Arrays;

public class ReverseArray {
	  public static int[] reverseArray(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left < right) {
	      int temp = arr[left];
	      arr[left] = arr[right];
	      arr[right] = temp;
	      left++;
	      right--;
	    }
	    return arr;
	  }

	  public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    int[] result = reverseArray(array);
	    System.out.println("Reversed array: " + Arrays.toString(result));
	  }
	}

/*he function uses two pointers, left and right, to traverse the array from both ends towards the center. At each step, the values at the left and right indices are swapped, until the pointers meet in the middle.
The reversed array is then returned.*/