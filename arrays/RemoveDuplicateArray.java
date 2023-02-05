package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	 public static int[] removeDuplicates(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        for (int value : arr) {
	            set.add(value);
	        }

	        int[] result = new int[set.size()];
	        int i = 0;
	        for (int value : set) {
	            result[i++] = value;
	        }

	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 5, 2, 8, 9, 3, 5, 2};
	        int[] uniqueArray = removeDuplicates(arr);
	        System.out.println("Unique elements in the array:");
	        for (int value : uniqueArray) {
	            System.out.println(value);
	        }

}
}
