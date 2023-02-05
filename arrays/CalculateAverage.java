package arrays;

public class CalculateAverage {

	static void avgArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int average = sum / arr.length;
        System.out.print("The Average value of array is " + average);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        avgArray(arr);
    }

}
