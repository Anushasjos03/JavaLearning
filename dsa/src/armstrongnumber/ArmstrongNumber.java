package armstrongnumber;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Step 1: Accept input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Store original number
        int original = num;
        int sum = 0;

        // Step 3: Calculate sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit; // cube of the digit
            num = num / 10;
        }

        // Step 4: Check if Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();

	}

}
