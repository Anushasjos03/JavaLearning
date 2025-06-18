package FractionalpartCalculator;
import java.util.Scanner;

public class FractionalPartCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Step 2: Extract integer part
        int integerPart = (int) number;

        // Step 3: Calculate fractional part
        double fractionalPart = number - integerPart;

        // Step 4: Display results
        System.out.println("Integer Part: " + integerPart);
        System.out.println("Fractional Part: " + fractionalPart);

	}

}
