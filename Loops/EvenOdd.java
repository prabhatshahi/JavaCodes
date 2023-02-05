package Loops;

/* 3. Program to equal operator and not equal operators.
* 4. Write a program to print the odd and even numbers.
*/
import java.util.Scanner;

public class EvenOdd {
	public static void evenNumbers(int n) {
	        System.out.println("These are Even Numbers from 0 to " + n);
	        //loop executes until the condition becomes false
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println(" ");
	    }

	  public  static void oddNumbers(int n) {
	        System.out.println("\nThese are Odd Numbers from 1 to " + n);
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 != 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int num;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any Number : ");
	        num = sc.nextInt();
	        evenNumbers(num);
	        oddNumbers(num);
	    }

}
