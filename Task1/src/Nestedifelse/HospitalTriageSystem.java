package Nestedifelse;
import java.util.Scanner;
public class HospitalTriageSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Has severe symptoms? (yes/no): ");
	        String hasSevereSymptoms = scanner.nextLine().toLowerCase();

	        if (hasSevereSymptoms.equals("yes")) {
	            if (age > 60) {
	                System.out.println("High Priority patient");
	            } else {
	                System.out.println("Medium Priority patient");
	            }
	        } else {
	            System.out.println("Low Priority patient");
	        }
	}

}
