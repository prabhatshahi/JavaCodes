package arrays;

import java.util.Scanner;

public class InsertArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      
      int[] arr = new int[size + 1];
      System.out.print("Enter the elements of the array: ");
      for (int i = 0; i < size; i++) {
         arr[i] = sc.nextInt();
      }
      
      System.out.print("Enter the position to insert the element: ");
      int pos = sc.nextInt();
      
      System.out.print("Enter the element to insert: ");
      int ele = sc.nextInt();
      
      for (int i = size - 1; i >= pos - 1; i--) {
         arr[i + 1] = arr[i];
      }
      arr[pos - 1] = ele;
      
      System.out.print("Array after insertion: ");
      for (int i = 0; i < size + 1; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
