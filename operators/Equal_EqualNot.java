package operators;

import java.util.Scanner;

public class Equal_EqualNot {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		
		int a = scan.nextInt();
		
		System.out.println("Enter the Second Number ");
		
		int b = scan.nextInt();
		
		if(a==b) {
			System.out.println("Both number is Equal");
			
		}
		
		else if(a != b){
			System.out.println("Both number is not equal");
		}
	}

}
