package arrays;

public class GetDiffrence {

	public static int getDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 9, 3};
        int difference = getDifference(arr);
        System.out.println("Difference of largest and smallest value: " + difference);
    }
}
