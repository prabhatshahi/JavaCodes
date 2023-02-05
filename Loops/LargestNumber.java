
package Loops;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the second number");
		b = sc.nextInt();
		System.out.println("Enter the third number");
		c = sc.nextInt();
		
		if ((a > b) && (a > c)) {
            System.out.println("The Largest Number is : " + a);
        }
        else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number is : " + b);
        }
        else {
            System.out.println("The Largest Number is : " + c);
        }
		
		
	}

}
