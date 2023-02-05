package operators;

/* 7. Print the smaller and larger number
*/
public class Smaller_Larger {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		int min = (a < b) ? a : b;
		int max = (a > b) ? a : b;

		System.out.println("smaller number is " + min);
		System.out.println("Larger number is " + max);
		if (a > b) {
			System.out.println("Larger Number is " + a);
		} else {
			System.out.println("Smaller Number is " + a);
			
			//second way to write above program 
		}
		if (b > a) {
			System.out.println("Larger Number is " + b);
		} else {
			System.out.println("Smaller Number is " + b);
		}
	}
}
