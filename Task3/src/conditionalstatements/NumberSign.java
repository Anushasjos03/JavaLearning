package conditionalstatements;

import java.util.Scanner;
//First, check if number is zero.
//Then, check if it's positive or negative.
//Inside that, check if it's even or odd using % 2.
public class NumberSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj4 = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = obj4.nextInt();

		 if (num == 0) {
	            System.out.println("Zero");
	        } else if (num > 0) {
	            if (num % 2 == 0) {
	                System.out.println("Positive even");
	            } else {
	                System.out.println("Positive odd");
	            }
	        } else { // num < 0
	            if (num % 2 == 0) {
	                System.out.println("Negative even");
	            } else {
	                System.out.println("Negative odd");
	            }
	        }

	}

}
