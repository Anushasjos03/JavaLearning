package Nestedforloop;
import java.util.Scanner;
public class MultiplicationTableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(); // Move to the next line
        }
	}

}
