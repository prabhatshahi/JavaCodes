package Loops;

import java.util.Scanner;

public class EvenOddSwitch {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n % 2) {
		case 0: 
			System.out.println(n+ "is an even Number");
			break;
			
		case 1:
			System.out.println(n+ "is an odd number");
			break;
		
		}
	}

}
