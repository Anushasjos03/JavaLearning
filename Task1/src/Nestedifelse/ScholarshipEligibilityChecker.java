package Nestedifelse;
import java.util.Scanner;
public class ScholarshipEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        System.out.print("Enter family income: ");
        int income = scanner.nextInt();

        if (marks > 85) {
            if (income < 500000) {
                System.out.println("Full Scholarship granted.");
            } else {
                System.out.println("No Scholarship granted.");
            }
        } else if (marks >= 70 && marks <= 85) {
            if (income < 300000) {
                System.out.println("Half Scholarship granted.");
            } else {
                System.out.println("No Scholarship granted.");
            }
        } else {
            System.out.println("No Scholarship granted.");
        }
	}

}
