package arrays;

import java.util.Scanner;

public class FindArrayIndex {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] array = new int[5];
      
      // Read the values of the array
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < array.length; i++) {
         array[i] = sc.nextInt();
      }
      
      System.out.print("Enter the element you want to find: ");
      int element = sc.nextInt();
      int index = -1;
      for (int i = 0; i < array.length; i++) {
         if (array[i] == element) {
            index = i;
            break;
         }
      }
      
      if (index == -1) {
         System.out.println("Element not found in the array.");
      } else {
         System.out.println("Index of the element is: " + index);
      }
   }
}

