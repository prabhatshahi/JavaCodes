package arrays;

import java.util.Scanner;

public class FindEvenOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < n; i++) {
			if (numbers[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Number of even numbers in the array: " + evenCount);
		System.out.println("Number of odd numbers in the array: " + oddCount);
	}
}
