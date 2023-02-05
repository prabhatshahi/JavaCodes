package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
  public static int[] removeElement(int[] arr, int element) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int num : arr) {
      if (num != element) {
        result.add(num);
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int element = 3;
    int[] result = removeElement(array, element);
    System.out.println("Array after removing element: " + Arrays.toString(result));
  }
}
