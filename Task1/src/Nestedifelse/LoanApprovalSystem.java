package Nestedifelse;
import java.util.Scanner;
public class LoanApprovalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Are you employed? (yes/no): ");
        String employed = scanner.nextLine().toLowerCase();

        if (employed.equals("yes")) {
            System.out.print("Enter credit score: ");
            int creditScore = scanner.nextInt();

            if (creditScore > 750) {
                System.out.println("Loan Approved.");
            } else if (creditScore >= 600 && creditScore <= 750) {
                System.out.println("Further review required.");
            } else {
                System.out.println("Loan Denied.");
            }
        } else {
            System.out.println("Loan Denied.");
        }
	}

}
