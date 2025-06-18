package Nestedforloop;

import java.util.Scanner;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // Move to the next line after each row
		}
	}

}
