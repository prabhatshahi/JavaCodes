package arrays;

import java.util.Arrays;

public class CommonValueInArray {
	 public static void commonValues(int[] arr1, int[] arr2) {
	        for (int k : arr1) {
	            for (int i : arr2) {
	                if (k == i) {
	                    System.out.println("Common values : " + k);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {11, 66, 33, 44, 55};
	        int[] arr2 = {66, 55, 77, 11, 88};
	        System.out.println("arr1[] = " + Arrays.toString(arr1));
	        System.out.println("arr2[] = " + Arrays.toString(arr2));
	        commonValues(arr1, arr2);
	    }
	}